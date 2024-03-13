package com.JPA.App2.repository;

import com.JPA.App2.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SchoolRepository extends JpaRepository<School, Integer> {

        @Query(value = "Select count(name) From School")
        public int fetchAllFromCustomer();
}
