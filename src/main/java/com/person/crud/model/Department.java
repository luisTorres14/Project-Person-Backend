package com.person.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Para guardar en bd se tiene que importar unas anotaciones

@Entity
@Table(name = "department")
public class Department {

	// Para decirle a la bd que este atributo(id) sera la clave o key que va definir
	// e identifcar a ese objeto
	@Id
	// para que genere el id automaticamente
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name="id_country")
	private Country country;
	private String name;

	public Department() {
	}

	public Department(Country country, String name) {
		super();
		this.country = country;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
