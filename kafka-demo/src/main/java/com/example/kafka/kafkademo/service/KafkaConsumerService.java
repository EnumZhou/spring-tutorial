package com.example.kafka.kafkademo.service;

import com.example.kafka.kafkademo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {

    private static final String TOPIC="kafka_example";

    @KafkaListener(topics =TOPIC, groupId = "user",containerFactory ="kafkaListenerContainerFactory")
    public void consumeUser(User user) {
        System.out.println("Consumed JSON Object: "+user);
    }
}
