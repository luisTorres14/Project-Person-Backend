package com.person.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Para guardar en bd se tiene que importar unas anotaciones

@Entity
@Table(name = "person")
public class Person {

	// Para decirle a la bd que este atributo(id) sera la clave o key que va definir
	// e identifcar a ese objeto
	@Id
	// para que genere el id automaticamente
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	// si queremos cambiar el nombre en la bd se usa esta notacion
	// @Column(name = "completed_name")

	private String name;
	private String lastname;
	private int age;

	// relacion uno a muchos, una persona solo puede tener asociado un pais, un pais
	// puede tener muchas personas
	@ManyToOne
	@JoinColumn(name = "id_country")
	private Country country;

	@ManyToOne
	@JoinColumn(name = "id_department")
	private Department department;

	public Person() {
	}
	
	public Person(String name, String lastname, int age, Country country, Department department) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.country = country;
		this.department = department;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
}
