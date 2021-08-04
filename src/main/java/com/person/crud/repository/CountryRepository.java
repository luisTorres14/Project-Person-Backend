package com.person.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.person.crud.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
