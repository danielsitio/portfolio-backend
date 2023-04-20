package com.danest.portfoliobackend.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.danest.portfoliobackend.dto.ProjectInput;
import com.danest.portfoliobackend.model.Project;

@RestController
@RequestMapping("/project")
@CrossOrigin
public class ProjectController {

    private List<Project> projects = new ArrayList<>();

    public ProjectController() {
    }

    @GetMapping("getAll")
    List<Project> getProjects() {
        return this.projects;
    }

    @PostMapping("/add")
    Project addProject(@RequestBody ProjectInput projectInput) {
        Project newProject = new Project(projectInput.getName(), projectInput.getDescription());
        this.projects.add(newProject);
        return newProject;
    }

    @DeleteMapping("/delete")
    void deleteProject(@RequestParam int projectId) {
        for (int index = 0; index < projects.size(); index++) {
            if (projects.get(index).getId() == projectId) {
                this.projects.remove(index);
                break;
            }
        }
    }

    @PatchMapping("/modify")
    String modifyProject(@RequestParam String projectId) {
        return "se modifico el proyecto" + projectId;
    }

}
