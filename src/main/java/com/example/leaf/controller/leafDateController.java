package com.example.leaf.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/leaf/")
public class leafDateController {

    @GetMapping("leafDate")
    public String date(Model model){
        model.addAttribute("localDateTime", LocalDateTime.now());
        return "/leaf/leafDate";
    }
    
}
