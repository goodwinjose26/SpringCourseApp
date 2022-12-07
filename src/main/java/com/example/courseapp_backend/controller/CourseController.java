package com.example.courseapp_backend.controller;

import com.example.courseapp_backend.dao.CourseDao;
import com.example.courseapp_backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "applications/json")
    public String add(@RequestBody Course c)
    {
        System.out.println(c.getTitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDate().toString());
        System.out.println(c.getDuration().toString());
        dao.save(c);
        return  "course added successfully";

    }



    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Course> searchCourse(@RequestBody Course c)
    {
        String title=String.valueOf(c.getTitle());
        System.out.println(title);
        return (List<Course>) dao.searchCourse(title);

    }
    @CrossOrigin(origins = "*")
@GetMapping("/view")
    public List<Course> view()
{
    return (List<Course>) dao.findAll();
}
}
