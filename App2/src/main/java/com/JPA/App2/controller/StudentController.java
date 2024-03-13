package com.JPA.App2.controller;

import com.JPA.App2.entity.School;
import com.JPA.App2.entity.Student;
import com.JPA.App2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/addStudent")
    public Student addProduct(@RequestBody  Student student) {
        return service.saveStudent(student);
    }
//    @GetMapping("/school")
//    public int fetchController() {
//        return service.fetchALl();
//    }
}
