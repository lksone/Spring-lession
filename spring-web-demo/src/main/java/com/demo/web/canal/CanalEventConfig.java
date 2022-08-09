package com.demo.web.canal;

import com.alibaba.otter.canal.client.CanalConnector;
import com.alibaba.otter.canal.client.CanalConnectors;
import com.alibaba.otter.canal.protocol.CanalEntry;
import com.alibaba.otter.canal.protocol.Message;
import com.alibaba.otter.canal.protocol.exception.CanalClientException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;
import java.util.List;

/**
 * cannel的数据库主从一致性
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/6/4 22:28
 */
@Component
@PropertySource("classpath:canal.properties")
public class CanalEventConfig implements ApplicationListener {

    @Value("${host}")
    private String host;

    @Value("${port}")
    private int port;
    @Value("${destination}")
    private String destination;
    @Value("${database}")
    private String database;

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

        CanalConnector connector = CanalConnectors.newSingleConnector(new InetSocketAddress(host, port), destination, "", "");
        while (true) {
            try {
                //创建链接
                int batchSize = 1000;
                connector.connect();
                System.out.println("======== Connected canal server success ========");
                //订阅数据库名，//通配此处不做更改
                connector.subscribe(database + "\\..*");
                connector.rollback();
                while (true) {
                    // 获取指定数量的数据
                    Message message = connector.getWithoutAck(batchSize);
                    long batchId = message.getId();
                    int size = message.getEntries().size();
                    //当message.getId不等于-1或0时代表监控到了数据
                    if (batchId == -1 || size == 0) {
                        try {
                            //1分钟秒获取一次数据
                            Thread.sleep(60000);
                        } catch (InterruptedException e) {
                        }
                    } else {
                        //具体分析数据类，可根据自己需求进行修改
                        dealEntry(message.getEntries());
                    }
                    // 提交确认
                    connector.ack(batchId);
                }
            } catch (CanalClientException e) {
                System.out.println("!!!!!! Disconnect canal server  ！！！！！！");
            } finally {
                connector.disconnect();
                try {
                    //连接失败后，15秒重连一次
                    Thread.sleep(15000);
                    System.out.println("...... Connecting canal server  ......");
                } catch (InterruptedException e) {
                }

            }
        }
    }


    /**
     * 对数据进行具体的分析
     *
     * @param entries
     */
    private void dealEntry(List<CanalEntry.Entry> entries) {
        for (CanalEntry.Entry entry : entries) {
            if (entry.getEntryType() == CanalEntry.EntryType.TRANSACTIONBEGIN || entry.getEntryType() == CanalEntry.EntryType.TRANSACTIONEND) {
                continue;
            }

            CanalEntry.RowChange rowChage = null;
            try {
                //获取修改的数据row
                rowChage = CanalEntry.RowChange.parseFrom(entry.getStoreValue());
            } catch (Exception e) {
                throw new RuntimeException("ERROR ## parser of eromanga-event has an error , data:" + entry.toString(), e);
            }
            //获取事件类型
            CanalEntry.EventType eventType = rowChage.getEventType();
//            System.out.println(String.format("======binlog[%s:%s] , database,table : %s,%s] , eventType : %s",
//                    entry.getHeader().getLogfileName(), entry.getHeader().getLogfileOffset(),
//                    entry.getHeader().getSchemaName(), entry.getHeader().getTableName(),
//                    eventType));
            //获取触发事件的表名
            String tableName = entry.getHeader().getTableName();
            //获取类型 增删改
            CanalEntry.EventType eventType1 = rowChage.getEventType();
            //获取库名
            String schemaName = entry.getHeader().getSchemaName();
            //获取表名称
            String tableName1 = entry.getHeader().getTableName();
            for (CanalEntry.RowData rowData : rowChage.getRowDatasList()) {
                //校验事件类型
                if (eventType == CanalEntry.EventType.DELETE) {
//                    printColumn(rowData.getBeforeColumnsList());

                } else if (eventType == CanalEntry.EventType.INSERT) {
//                    printColumn(rowData.getAfterColumnsList());
                } else if (eventType == CanalEntry.EventType.UPDATE) {
//                    System.out.println("-------&gt; before");
//                    printColumn(rowData.getBeforeColumnsList());
//                    System.out.println("-------&gt; after");
//                    printColumn(rowData.getAfterColumnsList());

                }
            }
        }
    }
}
