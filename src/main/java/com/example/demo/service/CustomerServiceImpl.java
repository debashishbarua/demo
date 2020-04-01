package com.example.demo.service;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public int create(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.create(customer);
	}

	@Override
	public int update(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.update(customer);
	}

	@Override
	public int delete(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.delete(customer);
	}

	@Override
	public List<Customer> findAll() {
		
		return customerDao.findAll();
	}
}
