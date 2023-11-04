package com.example.demo.entity;

import java.io.Serializable;
import java.util.Set;

import com.example.demo.enumeration.CardRarity;
import com.example.demo.enumeration.SpellType;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Spell")
public class SpellCard extends Card implements Serializable {
	//Attributes
	@Column
	@Enumerated(EnumType.STRING)
	private SpellType type;

	//Constructors
	public SpellCard(){}

	public SpellCard(SpellType type) {
		this.type = type;
	}

	public SpellCard(int id, String name, String description, CardRarity rarity, Set<SellerBinder> binder, Set<CardPrints> prints, SpellType type) {
		super(id, name, description, rarity, binder, prints);
		this.type = type;
	}

	//Getters and Setters

	public SpellType getType() {
		return type;
	}

	public void setType(SpellType type) {
		this.type = type;
	}


}
