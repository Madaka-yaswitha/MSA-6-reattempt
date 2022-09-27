package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerrepository;
	
	@PostMapping("/addcustomer")
	public String saveCustomer(@RequestBody Customer c) {
		customerrepository.save(c);
		return "User added sucessfully::"+c.getId();
	}
		
	@GetMapping("/customer")
	public List<Customer>getStudent() {
		return customerrepository.findAll();
	}
	@GetMapping("/findcustomer/{id}")
	public Optional<Customer>getStudent(@PathVariable Integer id) {
		return customerrepository.findById(id);
	}
	@GetMapping("/deleteCustomer/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		customerrepository.deleteById(id);
		return "Deleted Student Sucessfully";
	}
}


