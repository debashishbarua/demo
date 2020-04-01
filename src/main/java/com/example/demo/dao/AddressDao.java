package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Address;

public interface AddressDao {

	int create(Address address);

	List<Address> findAll();

}
