package com.lcwd.mvc.SpringMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuperMan {

    @GetMapping("/about")
    public String aboutRequestHandler() {
        System.out.println("Processing about request");
        return "about"; // Looks for about.html in src/main/resources/templates
    }

    @GetMapping("/service")
    public String aboutServiceHandler() {
        System.out.println("Processing service request");
        return "services"; // Looks for about.html in src/main/resources/templates
    }
}
