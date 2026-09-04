package com.example.energierechner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeraeteController {

    @GetMapping("/api/geraete/test")
    public String test() {
        return "Geraete API funktioniert!";
    }
}
