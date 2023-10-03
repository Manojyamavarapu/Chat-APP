package com.example.chatapp.models;

import com.google.firebase.Timestamp;

public class UserModel {
    private String name;
    private String username;
    private Timestamp createdTimestamp;

    private String userID;

    public UserModel() {
    }

    public UserModel(String name, String username, Timestamp createdTimestamp, String userID) {
        this.name = name;
        this.username = username;
        this.createdTimestamp = createdTimestamp;
        this.userID = userID;
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

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
