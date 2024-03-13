package com.courierservice.Courier.repository;

import com.courierservice.Courier.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
