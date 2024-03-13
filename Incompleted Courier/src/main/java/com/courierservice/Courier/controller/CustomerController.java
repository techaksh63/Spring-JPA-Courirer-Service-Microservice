package com.courierservice.Courier.controller;

import com.courierservice.Courier.entity.Customer;
import com.courierservice.Courier.entity.Item;
import com.courierservice.Courier.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
    @Autowired
    private CustomerService service;
    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return service.saveCustomer(customer);
    }

}
