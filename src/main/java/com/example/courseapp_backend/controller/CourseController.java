package com.example.courseapp_backend.controller;

import com.example.courseapp_backend.model.Course;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @PostMapping(path = "/add",consumes = "application/json",produces = "applications/json")
    public String add(@RequestBody Course c)
    {
        System.out.println(c.getTitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDate().toString());
        System.out.println(c.getDuration().toString());
        return  "course added successfully";
    }

@PostMapping("/view")
    public String view()
{
    return "VIEW THE COURSES";
}
}
