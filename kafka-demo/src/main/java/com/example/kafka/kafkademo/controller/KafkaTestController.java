package com.example.kafka.kafkademo.controller;

import com.example.kafka.kafkademo.constant.GenderEnum;
import com.example.kafka.kafkademo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
@Slf4j
public class KafkaTestController {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    private static final String TOPIC="kafka_example";

    @GetMapping("hello")
    public String hello(){
        log.info("Hello displayed");
        return "Hello!";
    }

    @GetMapping("send/{name}")
    public User getUser(@PathVariable String name) {
        User user = new User(name,28, GenderEnum.MAN);
        kafkaTemplate.send(TOPIC,user);
        return user;
    }
}
