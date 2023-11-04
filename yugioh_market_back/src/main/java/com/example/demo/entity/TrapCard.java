package com.example.demo.entity;

import java.io.Serializable;
import java.util.Set;

import com.example.demo.enumeration.CardRarity;
import com.example.demo.enumeration.TrapType;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Trap")
public class TrapCard extends Card implements Serializable{
	//Attributes
	@Column
	@Enumerated(EnumType.STRING)
	private TrapType type;

	//Constructors
	public TrapCard(){}

	public TrapCard(TrapType type) {
		this.type = type;
	}

	public TrapCard(int id, String name, String description, CardRarity rarity, Set<SellerBinder> binder, Set<CardPrints> prints, TrapType type) {
		super(id, name, description, rarity, binder, prints);
		this.type = type;
	}

	//Getters and Setters

	public TrapType getType() {
		return type;
	}

	public void setType(TrapType type) {
		this.type = type;
	}
}
