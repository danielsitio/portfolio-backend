package com.danest.portfoliobackend.controller;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.danest.portfoliobackend.model.Project;

@CrossOrigin
@RestController
public class TestController {

    @GetMapping("test")
    String alive() {
        return "Hello!";
    }

    @PostMapping("addProject")
    String addProject(@RequestBody Project newProject) {
        return newProject.getName();
    }

    @GetMapping("projects")
    Project getProjects() {
        Project proyecto1 = new Project("projecto 1", "el primero de");
        return proyecto1;
    }
}
