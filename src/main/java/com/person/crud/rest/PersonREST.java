package com.person.crud.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.person.crud.model.Person;
import com.person.crud.service.PersonService;

@RestController
@RequestMapping("/person/")
public class PersonREST {

	@Autowired
	private PersonService personService;

	@GetMapping
	private ResponseEntity<List<Person>> getAllPersons() {
		return ResponseEntity.ok(personService.findAll());
	}

	// metodo que guarda una persona
	// @requestBody hace que el body sea obligatorio, es decir siempre que se haga
	// un post debe mandar una persona obligatoriamente
	@PostMapping
	private ResponseEntity<Person> savePerson(@RequestBody Person person) {
		try {
			Person personSaved = personService.save(person);
			return ResponseEntity.created(new URI("/person/" + personSaved.getId())).body(personSaved);
		} catch (URISyntaxException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	// Retorna verdadero si elemento fue eliminado
	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<Boolean> deletePerson(@PathVariable("id") Long id) {
		personService.deleteById(id);
		return ResponseEntity.ok(!(personService.findById(id) != null));

	}
}
