package com.lcwd.mvc.SpringMvcProject.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Value("${lcwd.profile.image.path}")
    private String profilePath;


    @RequestMapping("/login")
    public String showLoginPageHandler(){
        return  "login";
    }


    @RequestMapping("/profile-path")
    public String getProfilePath(){
        return this.profilePath;
    }

}
