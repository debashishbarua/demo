package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerDao {

	int create(Customer customer);

	int update(Customer customer);

	int delete(Customer customer);

	List<Customer> findAll();

}
