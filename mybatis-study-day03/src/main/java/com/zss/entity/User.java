package com.zss.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private int id;
    private String username;
    private String password;

    public User(int id, String name, String password) {
        this.id = id;
        this.username = name;
        this.password = password;
    }

    public User(String name, String password) {
        this.username = name;
        this.password = password;
    }

    public User() {
    }
}
