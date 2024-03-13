package com.JPA.App2.service;

import com.JPA.App2.entity.Teacher;
import com.JPA.App2.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository repository;
    public Teacher saveTeacher(Teacher teacher){
        return repository.save(teacher);
    }
}
