package com.person.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Para guardar en bd se tiene que importar unas anotaciones

@Entity
@Table (name = "Country")
public class Country {
	
	// Para decirle a la bd que este atributo(id) sera la clave o key que va definir
	// e identifcar a ese objeto
	@Id
	//para que genere el id automaticamente
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	public Country() {
	}
	
	public Country(String name) {
		super();
		this.name = name;
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
}
