package com.danest.portfoliobackend.persistence;

public class User {
    private int id;
    private String username;
    private String password;
    private String authority;

    public String getAuthority() {
        return authority;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
