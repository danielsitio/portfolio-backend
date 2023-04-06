package com.danest.portfoliobackend.model;

import java.util.Date;

public class Project {
    private String name;
    private String description;

    public Project(String name, String description) {
        this.description = description;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}