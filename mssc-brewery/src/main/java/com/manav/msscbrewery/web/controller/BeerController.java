package com.manav.msscbrewery.web.controller;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manav.msscbrewery.service.BeerService;
import com.manav.msscbrewery.web.model.BeerDto;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}

	private final BeerService beerService;

	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID id) {
		return new ResponseEntity<>(beerService.getBeerById(id), HttpStatus.OK);

	}

	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BeerDto> handlePost(@RequestBody BeerDto beerdto) {

		BeerDto savedDto = beerService.saveDto(beerdto);

		HttpHeaders header = new HttpHeaders();
		header.set("Location", "/api/v1/beer/" + savedDto.getId().toString());

		return new ResponseEntity<BeerDto>(header, HttpStatus.CREATED);

	}

}
