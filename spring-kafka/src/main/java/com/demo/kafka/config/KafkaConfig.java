package com.demo.kafka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.listener.ConsumerRecordRecoverer;
import org.springframework.kafka.listener.DeadLetterPublishingRecoverer;
import org.springframework.kafka.listener.ErrorHandler;
import org.springframework.kafka.listener.SeekToCurrentErrorHandler;
import org.springframework.util.backoff.BackOff;
import org.springframework.util.backoff.FixedBackOff;

@Configuration
public class KafkaConfig {

    @Bean
    @Primary
    public ErrorHandler kafkaErrorHandler(KafkaTemplate<?, ?> template) {
        ConsumerRecordRecoverer recoverer = new DeadLetterPublishingRecoverer(template);
        BackOff backOff = new FixedBackOff(10 * 1000L, 3L);
        // 创建 SeekToCurrentErrorHandler 对象
        return new SeekToCurrentErrorHandler(recoverer, backOff);
    }
}
