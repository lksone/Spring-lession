package com.demo.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author lks
 * @Time 2020/9/2
 **/
public class StreamDemo {

    public static void main(String[] args) {
        List<String> orderNos = Collections.synchronizedList(new ArrayList<>());
        IntStream.range(0,8000000).parallel().forEach(i->{
            orderNos.add(UUID.randomUUID().toString());
        });

        List<String> collect = orderNos.stream().distinct().collect(Collectors.toList());

        System.out.println("订单样例"+orderNos.get(22));
        System.out.println("生成数量"+orderNos.size());
        System.out.println("去除重复订单数量"+collect.size());
        System.out.println("生成重复订单的数量"+(orderNos.size() -collect.size()));
    }
}
