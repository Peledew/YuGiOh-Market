package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

	//Methods
	@Override
	public String toString() {
		return "Location [id=" + id + ", country=" + country + ", city=" + city + ", zipcode=" + zipcode + ", region="
				+ region + "]";
	}
}
