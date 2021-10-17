package com.tiburcio.bicyclesandshops.entity.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "shops")
public class Shop implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	private String city;
	
	@JsonIgnore
	@OneToMany(mappedBy = "shop")
	private List<Bicycle> bicycles;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Bicycle> getBicycles() {
		return bicycles;
	}

	public void setBicycles(List<Bicycle> bicycles) {
		this.bicycles = bicycles;
	}

	public Shop(String city) {
		super();
		this.city = city;
	}

	public Shop() {
		super();
	}
	
	
}
