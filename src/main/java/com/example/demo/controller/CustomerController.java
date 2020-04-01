package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@Controller
@RequestMapping("/customer")
//@RestController[@Controller + @ResponseBody]
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	//@RequestMapping(value="/customer", method = RequestMethod.GET)
	@ResponseBody
	public List<Customer> findAll() {
		return customerService.findAll();
	}

	@ResponseBody
	@PostMapping
	public Customer create(@RequestBody Customer customer) {
		int r = customerService.create(customer);
		return customer;

	}

	@ResponseBody
	@PutMapping
	public Customer Update() {
		return null;
	}

	@ResponseBody
	@DeleteMapping
	public Customer delete(@RequestParam("id") int id) {
		return null;
	}

}
