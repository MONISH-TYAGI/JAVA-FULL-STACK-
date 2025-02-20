package com.lcwd.mvc.SpringMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;



@Controller
@RequestMapping("/api")
public class ApiCOntroller {

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    @ResponseBody
    public String helloApi(){

       return "Hello,how are you,  what;s going these days";
    }

    @RequestMapping(value="/users",method=RequestMethod.GET)
    @ResponseBody
    public List<String> getUserData(){
        return Arrays.asList("Ram","Shyam","add");
    }




    @RequestMapping(value="/create-user",method= RequestMethod.POST)
    @ResponseBody
    public String createUser(){
        System.out.println("createUser is done");
        return "user created";
    }
}
