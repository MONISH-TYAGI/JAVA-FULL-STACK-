package com.lcwd.mvc.SpringMvcProject.controllers;

import com.lcwd.mvc.SpringMvcProject.controllers.config.LCWDConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class HomeController {

    @Value("${lcwd.profile.image.path}")
    private String profilePath;

    @Autowired
    private LCWDConfig lcwdConfig;

    @RequestMapping("/todos")
    public List<String> justTest(){
        List<String> todos= Arrays.asList(
                "abc",
                "sed",
                "ad"
        );
        return todos;
    }
    @RequestMapping("/profile-path")
    public String getProfilePath(){
      return this.profilePath;
    }

    @RequestMapping("/lcwdconfig")
    public LCWDConfig getLcwdConfig() {
        System.out.println(this.lcwdConfig);
        return lcwdConfig;
    }
}
