package com.example.demo.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "card_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Card implements Serializable {

	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	protected String name;

	@Column
	protected String description;

	//TODO: meti da bude neki enum
	@Column
	protected String rarity;

	@OneToMany(mappedBy = "card")
	Set<SellerBinder> binder;

	@OneToMany(mappedBy = "card")
	Set<CardPrints> prints;


	
	//Constructors
	public Card() {}

	public Card(int id, String name, String description, String rarity, Set<SellerBinder> binder, Set<CardPrints> prints) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.rarity = rarity;
		this.binder = binder;
		this.prints = prints;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRarity() {
		return rarity;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	public Set<SellerBinder> getBinder() {
		return binder;
	}

	public void setBinder(Set<SellerBinder> binder) {
		this.binder = binder;
	}

	public Set<CardPrints> getPrints() {
		return prints;
	}

	public void setPrints(Set<CardPrints> prints) {
		this.prints = prints;
	}
}
