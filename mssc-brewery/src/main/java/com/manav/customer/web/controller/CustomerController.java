package com.manav.customer.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manav.customer.web.model.CustomerDto;
import com.manav.customer.web.service.CustomerService;
@RestController
@RequestMapping("/customer")
public class CustomerController {

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	private final CustomerService customerService;

	@RequestMapping("/{custId}")
	public ResponseEntity<CustomerDto> getCustomerById(
			@PathVariable("custId") UUID id) {
		return new ResponseEntity<CustomerDto>(
				customerService.getCustomerById(id), HttpStatus.OK);

	}

}
