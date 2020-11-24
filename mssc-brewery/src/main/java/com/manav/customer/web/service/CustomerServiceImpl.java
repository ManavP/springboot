package com.manav.customer.web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.manav.customer.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID id) {

		return CustomerDto.builder().id(UUID.randomUUID()).name("Manav")
				.build();
	}

}
