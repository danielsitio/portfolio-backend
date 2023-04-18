package com.danest.portfoliobackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danest.portfoliobackend.model.Skill;

@RestController
@RequestMapping("/skill")
public class SkillController {
    @GetMapping("/getAll")
    List<Skill> getSkills() {
        return List.of(new Skill("Ingles", 1));
    }
}
