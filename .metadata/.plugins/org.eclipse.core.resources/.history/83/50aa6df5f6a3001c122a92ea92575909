package com.aduilio.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aduilio.spring.entity.Customer;
import com.aduilio.spring.exception.CustomerNotFoundException;
import com.aduilio.spring.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	/**
	 * Create a customer.
	 *
	 * @param customer from the request
	 *
	 * @return the customer id
	 */
	public Long create(Customer customer) {
		return customerRepository.save(customer)
				.getId();
	}

	/**
	 * Read a customer by id.
	 *
	 * @param id
	 *
	 * @return a customer
	 */
	public Customer read(Long id) {
		return customerRepository.findById(id)
				.orElseThrow(() -> new CustomerNotFoundException(id));
	}
}
