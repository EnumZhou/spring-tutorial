package com.example.kafka.kafkademo.model;

import com.example.kafka.kafkademo.constant.GenderEnum;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String name;
    private int age;
    private GenderEnum gender;
}
