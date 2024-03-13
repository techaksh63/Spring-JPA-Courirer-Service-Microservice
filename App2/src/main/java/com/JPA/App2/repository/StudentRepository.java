package com.JPA.App2.repository;

import com.JPA.App2.entity.School;
import com.JPA.App2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
//    @Query(value = "Select count(name) From Student")
//    public int fetchAllFromCustomer();
}
