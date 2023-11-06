package com.example.demo.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CardSet implements Serializable {

	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String mark;
	
	@Column
	private String name;
	
	@Column
	private String description;

	@OneToMany(mappedBy = "cardSet")
	Set<CardPrints> prints;

}
