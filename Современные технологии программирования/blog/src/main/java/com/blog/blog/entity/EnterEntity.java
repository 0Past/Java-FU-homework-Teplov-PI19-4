package com.blog.blog.entity;

import lombok.Data;

@Data
public class EnterEntity {
    private String email;
    private String password;

    @Override
    public String toString() {
        return "AuthEntity{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
