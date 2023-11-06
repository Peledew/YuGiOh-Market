package com.example.demo.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.example.demo.enumeration.CardRarity;
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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "card_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Card implements Serializable {

	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	protected String name;

	@Column(length = 500)
	protected String description;

	@Column
	@Enumerated(EnumType.STRING)
	protected CardRarity rarity;

	@OneToMany(mappedBy = "card")
	Set<SellerBinder> binder;

	@OneToMany(mappedBy = "card")
	Set<CardPrints> prints;


}
