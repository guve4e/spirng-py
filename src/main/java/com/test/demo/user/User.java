package com.test.demo.user;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {

    private String username = "guve4e";

    @JsonIgnore
    private String password = "password";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
