package com.person.crud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.crud.model.Country;
import com.person.crud.service.CountryService;

@RestController
//nos da la url base para acceder a este servicio
@RequestMapping("/country/")
public class CountryREST {

	@Autowired
	private CountryService countryService;

	// estamos habilitados para que mediante peticiones get dar una respuesta
	@GetMapping
	private ResponseEntity<List<Country>> getAllCountries() {
		return ResponseEntity.ok(countryService.findAll());
	}

}
