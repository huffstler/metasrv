package com.huffstler.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActionsController {

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String hitRoot(Model model) {
        model.addAttribute("appName", appName);
        System.out.println("hit me");
        return "YOU HIT ROOT";
    }
}
