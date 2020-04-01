package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerService {
	
	int create(Customer customer);

	int update(Customer customer);

	int delete(Customer customer);

	List<Customer> findAll();

}
