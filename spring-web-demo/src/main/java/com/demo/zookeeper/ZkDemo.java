package com.demo.zookeeper;

public class ZkDemo {

    public static void main(String[] args) {
        
        ZkClient zkClient = new ZkClient(
                "192.168.1.3:2181,192.168.1.4:2181,192.168.1.5:2181",
                20000
        );
    }
}
