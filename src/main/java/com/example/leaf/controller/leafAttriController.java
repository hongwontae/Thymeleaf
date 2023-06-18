package com.example.leaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class leafAttriController {

    @GetMapping("/leaf/leafAttri")
    public String attribute() {
        return "/leaf/leafAttri";
    }

}
