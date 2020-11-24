package com.manav.msscbrewery.service;

import java.util.UUID;

import com.manav.msscbrewery.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID id);

	BeerDto saveDto(BeerDto beerdto);

}
