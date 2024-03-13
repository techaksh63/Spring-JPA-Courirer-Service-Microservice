package com.JPA.Application.repository;

import com.JPA.Application.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);

    @Query("Select name From Product_table")
    public List<Product> getAllUser();
}

