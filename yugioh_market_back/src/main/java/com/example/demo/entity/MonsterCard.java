package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Monster")
public class MonsterCard extends Card implements Serializable{

	private String monsterbrate;
}
