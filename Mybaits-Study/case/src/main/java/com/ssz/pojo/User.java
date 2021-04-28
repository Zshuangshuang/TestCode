package com.ssz.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private int id;
    private String name;
    private String password;
    private String address;

    public User() {
    }

    public User(int id, String name, String password, String address) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
    }
}
