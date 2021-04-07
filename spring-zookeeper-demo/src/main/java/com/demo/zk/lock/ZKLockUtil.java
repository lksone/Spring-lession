package com.demo.zk.lock;

import org.apache.curator.shaded.com.google.common.base.Strings;
import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ZKLockUtil {

    private String zkQurom = "localhost:2181";

    private String lockNameSpace = "/mylock";

    private ZooKeeper zk;


    public ZKLockUtil() {
        try {
            zk = new ZooKeeper(zkQurom, 2000, new ZkWatch());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 判断节点是否存在，如果不存在就创建
     *
     * @throws InterruptedException
     */
    private void ensureRootPath() throws InterruptedException {
        try {
            if (zk.exists(lockNameSpace, true) == null) {
                zk.create(lockNameSpace, "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            }
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }

    /**
     * 观察节点
     *
     * @param nodeString
     * @param thread
     * @throws InterruptedException
     */
    private void watchNode(String nodeString, final Thread thread) throws InterruptedException {
        try {
            zk.exists(lockNameSpace + nodeString, new Watcher() {
                @Override
                public void process(WatchedEvent watchedEvent) {
                    System.out.println("==" + watchedEvent.toString());
                    //如果节点被删除，就停止当前线程
                    if (watchedEvent.getType() == Event.EventType.NodeDeleted) {
                        thread.interrupt();
                    }
                    try {
                        zk.exists(lockNameSpace + nodeString, new Watcher() {
                            @Override
                            public void process(WatchedEvent watchedEvent) {
                                if (watchedEvent.getType() == Event.EventType.NodeDeleted) {
                                    thread.interrupt();
                                }
                                try {
                                    zk.exists(lockNameSpace + nodeString, true);
                                } catch (KeeperException e) {
                                    e.printStackTrace();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }

                        });
                    } catch (KeeperException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            });
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取锁，获取顺序最小的锁，并且监听这个lock的状态；
     * 1、如果这个节点是当前线程获取到了锁，那么查看当前线程的锁是给锁进行排序；
     * 2、如果这个节点是等待节点的话，那么就要为获取节点在那个节点的位置上，对等待节点进行监听，知道这个节点获取到锁就行释放就行了
     *
     * @return
     * @throws InterruptedException
     */
    public void lock(String node) throws InterruptedException {
        String path = null;
        ensureRootPath();
        watchNode(node, Thread.currentThread());
        while (true) {
            try {
                //设置一个临时顺序节点
                path = zk.create(lockNameSpace + node, "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
                //获取锁节点下的孩子节点
                List<String> children = zk.getChildren(lockNameSpace, false);
                Collections.sort(children);
                //获取判断是否孩子，当前节点是否为最小的节点
                if (!Strings.nullToEmpty(path).trim().isEmpty() && !Strings.nullToEmpty(children.get(0)).trim().isEmpty() && path.equals(lockNameSpace + "/" + children.get(0))) {
                    System.out.println(Thread.currentThread().getName() + "  get Lock...");
                    return;
                }
                //获取当前节点在那，需要等待的节点是那个
                String watchNode = null;
                for (int i = children.size() - 1; i >= 0; i--) {
                    if (children.get(i).compareTo(path.substring(path.lastIndexOf("/") + 1)) < 0) {
                        watchNode = children.get(i);
                        break;
                    }
                }
                //如果等待节点不为空的话，那么监听等待节点，知道当前节点为开始初始化节点为止
                if (watchNode != null) {
                    final String watchNodeTmp = watchNode;
                    final Thread thread = Thread.currentThread();
                    //监视这个节点的状态变化
                    Stat stat = zk.exists(lockNameSpace + "/" + watchNodeTmp, new Watcher() {
                        @Override
                        public void process(WatchedEvent watchedEvent) {
                            //如果节点锁被释放
                            if (watchedEvent.getType() == Event.EventType.NodeDeleted) {
                                thread.interrupt();
                            }
                            try {
                                //监听
                                zk.exists(lockNameSpace + "/" + watchNodeTmp, true);
                            } catch (KeeperException e) {
                                e.printStackTrace();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                    });
                    if (stat != null) {
                        System.out.println("Thread " + Thread.currentThread().getId() + " waiting for " + lockNameSpace + "/" + watchNode);
                    }
                }
            } catch (KeeperException e) {
                System.out.println(Thread.currentThread().getName() + "获取锁失败");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    System.out.println("thread is notify");
                }
            }
            if (!Strings.nullToEmpty(path).trim().isEmpty()) {
                System.out.println(Thread.currentThread().getName() + "获取到了锁");
            }
        }
    }

    /**
     * 删除锁
     */
    public void unlock(String node) {
        try {
            zk.delete(lockNameSpace + node, -1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }

}
