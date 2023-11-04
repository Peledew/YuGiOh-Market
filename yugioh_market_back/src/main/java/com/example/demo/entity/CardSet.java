package com.example.demo.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.*;

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

	//Constructors
	public CardSet() {}

	public CardSet(int id, String mark, String name, String description, Set<CardPrints> prints) {
		this.id = id;
		this.mark = mark;
		this.name = name;
		this.description = description;
		this.prints = prints;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String seriesMark) {
		this.mark = seriesMark;
	}

	public String getName() {
		return name;
	}

	public void setName(String seriesName) {
		this.name = seriesName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String seriesDescription) {
		this.description = seriesDescription;
	}

	public Set<CardPrints> getPrints() {
		return prints;
	}

	public void setPrints(Set<CardPrints> prints) {
		this.prints = prints;
	}
}
