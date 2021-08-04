package com.person.crud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.crud.model.Department;
import com.person.crud.service.DepartmentService;

@RestController
@RequestMapping("/department/")
public class DepartmentREST {

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("{id}")
	private ResponseEntity<List<Department>> getAllDepartmentByCountry(@PathVariable("id") Long idCountry) {
		return ResponseEntity.ok(departmentService.findAllByCountry(idCountry));
	}
}
