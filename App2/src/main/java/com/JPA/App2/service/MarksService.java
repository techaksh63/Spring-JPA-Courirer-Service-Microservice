package com.JPA.App2.service;

import com.JPA.App2.entity.Marks;
import com.JPA.App2.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksService {
    @Autowired
    private MarksRepository repository;

    public Marks saveMarks(Marks marks){
        return repository.save(marks);
    }
}
