package com.JPA.App2.service;

import com.JPA.App2.entity.School;
import com.JPA.App2.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository repository;

    public School saveSchool(School school){
        return repository.save(school);
    }

    public int fetchALl(){
        return repository.fetchAllFromCustomer();
    }
}
