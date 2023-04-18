package com.danest.portfoliobackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danest.portfoliobackend.model.Experience;

@RestController
@RequestMapping("/experience")
public class ExperienceController {
    @GetMapping("/getAll")
    List<Experience> getAll() {
        return List.of(new Experience("empresa"));
    }
}
