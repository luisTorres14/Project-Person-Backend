package com.person.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.person.crud.model.Department;
import com.person.crud.repository.DepartmentRepository;

@Service
public class DepartmentService implements DepartmentRepository {

	// permite crear una inyeccion del departmentRepository sin necesidad de crear
	// una instancia
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> findAll() {
		return departmentRepository.findAll();
	}

	// muestra los departamentos que hacen parte del pais que se seleccione, en este
	// caso se busca por el id que se pasa como parametro
	public List<Department> findAllByCountry(Long idCountry) {
		List<Department> departmentResponse = new ArrayList<>();
		List<Department> departments = departmentRepository.findAll();
		;
		for (int i = 0; i < departments.size(); i++) {
			if (departments.get(i).getCountry().getId() == idCountry) {
				departmentResponse.add(departments.get(i));
			}
		}
		return departmentResponse;
	}

	@Override
	public List<Department> findAll(Sort sort) {
		return departmentRepository.findAll(sort);
	}

	@Override
	public List<Department> findAllById(Iterable<Long> ids) {
		return null;
	}

	@Override
	public <S extends Department> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Department> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Department> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Department getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Department> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Department> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Department entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Department> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Department> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Department> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}
