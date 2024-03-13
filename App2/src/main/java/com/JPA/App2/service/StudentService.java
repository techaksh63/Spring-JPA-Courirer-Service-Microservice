package com.JPA.App2.service;

import com.JPA.App2.entity.Student;
import com.JPA.App2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student){
       return repository.save(student);
    }
//    public int fetchALl(){
//        return repository.fetchAllFromCustomer();
//    }
}
