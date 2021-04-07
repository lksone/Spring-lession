package com.demo.zk.lock;

import lombok.extern.slf4j.Slf4j;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

/**
 * zk监听器
 */
@Slf4j
public class ZkWatch implements Watcher {

    @Override
    public void process(WatchedEvent watchedEvent) {
        System.out.println("zk监听器" + watchedEvent);
        if (Event.KeeperState.SyncConnected == watchedEvent.getState()) {
            System.out.println("connection is established...");
        }
    }
}
