package com.example.chatapp.models;

import com.google.firebase.Timestamp;

public class UserModel {
    private String name;
    private String username;
    private Timestamp createdTimestamp;

    public UserModel() {
    }

    public UserModel(String name, String username, Timestamp createdTimestamp) {
        this.name = name;
        this.username = username;
        this.createdTimestamp = createdTimestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Timestamp getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Timestamp createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }
}
