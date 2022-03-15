package com.aduilio.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.aduilio.spring.entity.Customer;
import com.aduilio.spring.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	/**
	 * Create a customer.
	 *
	 * @param customer from the request
	 *
	 * @return Customer
	 */
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Customer create(@RequestBody final Customer customer) {
		Long id = customerService.create(customer);
		customer.setId(id);

		return customer;
	}

	/**
	 * Read a customer by id
	 *
	 * @param id of the customer
	 *
	 * @return Customer
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Customer> read(@PathVariable final Long id) {
		Customer response = customerService.read(id);
		return ResponseEntity.ok(response);
	}
}
