package com.example.leaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class leafCalController {

    @GetMapping("leaf/leafCal")
    public String operation(Model model) {
    model.addAttribute("nullData", null);
    model.addAttribute("data", "Spring!");
    
    return "/leaf/leafCal";
}
    
}
