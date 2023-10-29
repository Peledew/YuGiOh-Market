package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Location {
	
	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String country;
	
	@Column
	private String city;
	
	@Column
	private int zipcode;
	
	@Column 
	private String region;
	
	//Constructors
	public Location() {}

	public Location(int id, String country, String city, int zipcode, String region) {
		super();
		this.id = id;
		this.country = country;
		this.city = city;
		this.zipcode = zipcode;
		this.region = region;
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	//Methods
	@Override
	public String toString() {
		return "Location [id=" + id + ", country=" + country + ", city=" + city + ", zipcode=" + zipcode + ", region="
				+ region + "]";
	}
}
