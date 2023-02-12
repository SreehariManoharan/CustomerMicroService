/**
 * 
 */
package com.customerService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerService.model.CustomerRegistrationRequest;
import com.customerService.service.CustomerService;
import com.customerService.serviceImpl.CustomerServiceImpl;

/**
 * @author sreeharimanoharan
 *
 */
@RestController
@RequestMapping("rest/v1")
public class CustomerController {
	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	private CustomerService customerService;
	public CustomerController(CustomerService customerService) {
		// TODO Auto-generated constructor stub
		this.customerService = customerService;
		System.out.println(" Customer service dependency " + this.customerService.toString());
	}
	
	@PostMapping("/customer")
	public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
		System.out.println("Customer registartion request " + customerRegistrationRequest);
		customerServiceImpl.registerCustomer(customerRegistrationRequest);
	}
	@GetMapping("/customer")
	public void fetchCustomer() {
		System.out.println("Fetch customer is hit");
	}
}
