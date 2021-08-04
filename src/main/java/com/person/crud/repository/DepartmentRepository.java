package com.person.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.person.crud.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
