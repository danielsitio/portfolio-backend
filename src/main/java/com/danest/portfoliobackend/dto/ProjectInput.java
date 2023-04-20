package com.danest.portfoliobackend.dto;

public class ProjectInput {
    private String name;
    private String description;

    public ProjectInput(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
