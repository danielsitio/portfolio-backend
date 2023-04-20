package com.danest.portfoliobackend.model;

public class Project {

    private static int contId = 0;

    private Integer id;
    private String name;
    private String description;

    public Project(String name, String description) {
        this.id = contId;
        contId++;
        this.description = description;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getId() {
        return id;
    }
}
