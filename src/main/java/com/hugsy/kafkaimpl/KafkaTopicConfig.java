package com.hugsy.kafkaimpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Value("$com.hugsy.kafka.topic1")
    private String topic1;


}
