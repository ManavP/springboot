package com.manav.msscbrewery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.manav.msscbrewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID id) {
		return BeerDto.builder().beerName("Test").beerStyle("Good")
				.id(UUID.randomUUID()).build();
	}

	@Override
	public BeerDto saveDto(BeerDto beerdto) {
		System.out.println("Here2");
		return BeerDto.builder().beerName(beerdto.getBeerName())
				.beerStyle(beerdto.getBeerStyle()).upc(beerdto.getUpc())
				.id(UUID.randomUUID()).build();
	}

}
