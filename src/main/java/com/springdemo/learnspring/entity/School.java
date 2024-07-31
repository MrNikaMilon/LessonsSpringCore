package com.springdemo.learnspring.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("school")
@Data
@Scope("singleton")
public class School {
    private String name;
    private String address;

    public School(@Value("name") String name, @Value("address")String address) {
        this.name = name;
        this.address = address;
    }
}
