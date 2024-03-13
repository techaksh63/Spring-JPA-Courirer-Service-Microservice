package com.courierservice.Courier.service;

import com.courierservice.Courier.entity.Customer;
import com.courierservice.Courier.entity.Item;
import com.courierservice.Courier.repository.CustomerRepository;
import com.courierservice.Courier.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ItemRepository itemRepository;

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

}
