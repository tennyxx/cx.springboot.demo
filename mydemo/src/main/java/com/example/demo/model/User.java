package com.example.demo.model;

import org.springframework.stereotype.Component;

/**
 * @author liucx
 */
@Component
public class User {
    private  int id;
    private  String name;
    private  int age;
    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
