package com.JPA.App2.controller;

import com.JPA.App2.entity.School;
import com.JPA.App2.repository.SchoolRepository;
import com.JPA.App2.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
    @Autowired
    private SchoolService service;

    @PostMapping("/addSchool")
    public School addSchool(@RequestBody School school){
        return service.saveSchool(school);
    }

    //    @GetMapping("/school")
//    public int fetchController() {
//        return service.fetchALl();
//    }
}
