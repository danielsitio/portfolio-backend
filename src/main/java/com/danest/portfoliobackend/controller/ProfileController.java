package com.danest.portfoliobackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    @GetMapping("/profile/picture")
    String getProfilePicture() {
        return "imagen";
    }

}
