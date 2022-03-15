package com.aduilio.spring.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.aduilio.spring.entity.Customer;
import com.aduilio.spring.exception.CustomerNotFoundException;
import com.aduilio.spring.repository.CustomerRepository;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

	@Mock
	private CustomerRepository mockCustomerRepository;

	@InjectMocks
	private CustomerService customerService;

	@Test
	void createWithValueShouldReturnId() {
		Customer requestCustomer = new Customer();

		Customer responseCustomer = new Customer();
		Long expectedId = 1L;
		responseCustomer.setId(expectedId);

		when(mockCustomerRepository.save(requestCustomer)).thenReturn(responseCustomer);

		Long id = customerService.create(requestCustomer);

		assertThat(id).isEqualTo(expectedId);
	}

	@Test
	void readWithValidIdShouldReturnCustomer() {
		Long requestId = 1L;

		Customer responseCustomer = new Customer();
		responseCustomer.setId(requestId);
		responseCustomer.setName("Customer Name");
		responseCustomer.setPhone("11 22334455");

		when(mockCustomerRepository.findById(requestId)).thenReturn(Optional.of(responseCustomer));

		Customer customer = customerService.read(requestId);

		assertThat(customer).isEqualTo(responseCustomer);
	}

	@Test
	void readWithInvalidIdShouldThrowException() {
		Long requestId = 0L;

		when(mockCustomerRepository.findById(requestId)).thenReturn(Optional.empty());

		CustomerNotFoundException exception = assertThrows(CustomerNotFoundException.class,
				() -> customerService.read(requestId));

		assertThat(exception.getMessage()).isEqualTo("Customer with id 0 does not exist");
	}
}
