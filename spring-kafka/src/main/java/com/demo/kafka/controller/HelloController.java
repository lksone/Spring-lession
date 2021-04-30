package com.demo.kafka.controller;


import com.demo.kafka.producer.HelloProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

@Slf4j
@RestController("/api/kafka")
public class HelloController {


    private final HelloProducer producer;

    @Autowired
    public HelloController(HelloProducer producer) {
        this.producer = producer;
    }


    @PostMapping("send")
    public String sender() throws ExecutionException, InterruptedException {
        String replace = UUID.randomUUID().toString().replace("-", "");
        producer.syncSend(123);
        return "成功";
    }
}
