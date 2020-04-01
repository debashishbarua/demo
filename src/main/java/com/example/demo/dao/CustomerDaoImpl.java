package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Customer customer) {
		String query = "insert into customer values(?,?,?)";
		return jdbcTemplate.update(query,
				new Object[] { customer.getId(), customer.getName(), customer.getMobileNo() });

	}
	@Override
	public int update(Customer customer) {
		return 0;
	}
	@Override
	public int delete(Customer customer) {
		return 0;
	}
	@Override
	public List<Customer> findAll() {
		String query = "select * from customer";
		return jdbcTemplate.query(
				query, 
				(rs, rowNum) -> new Customer(rs.getInt(1), rs.getString(2), rs.getString(3)));

	}

}
