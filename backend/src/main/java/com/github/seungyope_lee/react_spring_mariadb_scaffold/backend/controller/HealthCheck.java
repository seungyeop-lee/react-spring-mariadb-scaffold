package com.github.seungyope_lee.react_spring_mariadb_scaffold.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
