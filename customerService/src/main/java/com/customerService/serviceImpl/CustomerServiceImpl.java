/**
 * 
 */
package com.customerService.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerService.dao.CustomerRepository;
import com.customerService.model.Customer;
import com.customerService.model.CustomerRegistrationRequest;
import com.customerService.service.CustomerService;

/**
 * @author sreeharimanoharan
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRespository;
	
	public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
			// Below is the builder pattern
			Customer customer = Customer.builder().firstName(customerRegistrationRequest.getFirstName())
					.lastName(customerRegistrationRequest.getLastName()).email(customerRegistrationRequest.getEmail())
					.build();
			customerRespository.save(customer);
	}

}
