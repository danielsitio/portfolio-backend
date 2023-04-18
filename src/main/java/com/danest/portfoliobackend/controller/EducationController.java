package com.danest.portfoliobackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danest.portfoliobackend.model.Education;

@RestController
@RequestMapping("/education")
public class EducationController {
    @GetMapping("/getAll")
    List<Education> getAll() {
        return List.of(new Education("nombre de escula"));
    }
}
