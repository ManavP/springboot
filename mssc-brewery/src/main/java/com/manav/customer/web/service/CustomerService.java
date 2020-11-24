package com.manav.customer.web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.manav.customer.web.model.CustomerDto;

public interface CustomerService {
	CustomerDto getCustomerById(UUID id);
}
