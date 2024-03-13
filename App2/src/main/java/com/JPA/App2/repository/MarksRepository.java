package com.JPA.App2.repository;

import com.JPA.App2.entity.Marks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarksRepository extends JpaRepository<Marks, Integer> {
}
