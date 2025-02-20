package com.lcwd.mvc.SpringMvcProject.controllers;


import com.lcwd.mvc.SpringMvcProject.models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class FeebackController {

    @GetMapping("/feedback")
    public List<String> getFeedbacks(){
         List<String> feedbacks= Arrays.asList(
                 "Good course",
                 "Nice one",
                  "valuable"
         );
         return feedbacks;
    }

    @PostMapping("/create-feedback")
    public String createFeedback(){
       return "Created feedback";
    }

    @PostMapping("/create")
    public Student createFeedback(@RequestBody List<Student> data){
        System.out.println(data);


        return data.get(0);
    }

}
