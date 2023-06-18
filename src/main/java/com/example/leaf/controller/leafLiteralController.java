package com.example.leaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class leafLiteralController {

    @GetMapping("/leaf/leafLiteral")
    public String literal(Model model) {
    model.addAttribute("data", "Spring!");
    return "/leaf/leafLiteral";
}
    
}
