package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Spell")
public class SpellCard extends Card implements Serializable {
	private String spelaloe;

}
