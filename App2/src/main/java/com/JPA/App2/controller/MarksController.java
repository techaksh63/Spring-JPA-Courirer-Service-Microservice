package com.JPA.App2.controller;

import com.JPA.App2.entity.Marks;
import com.JPA.App2.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarksController {
    @Autowired
    private MarksService service;
    @PostMapping("/addMarks")
    public Marks saveMarks(@RequestBody Marks marks){
        return service.saveMarks(marks);
    }
}
