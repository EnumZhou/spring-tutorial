package com.example.kafka.kafkademo.model;

import com.example.kafka.kafkademo.constant.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int age;
    private GenderEnum gender;
}
