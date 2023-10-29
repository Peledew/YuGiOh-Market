package com.example.demo.entity;

import java.io.Serializable;

import com.example.demo.enumeration.CardAttributesEnum;
import com.example.demo.enumeration.MonsterCardTypesEnum;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
@DiscriminatorValue("Monster")
public class MonsterCard extends Card implements Serializable{

	@Column
	private int atk;
	
	@Column
	private int def;
	
	@Column
	private int level;
	
	@Column
	@Enumerated(EnumType.STRING)
	private CardAttributesEnum attribute;
	
	@Column
	@Enumerated(EnumType.STRING)
	private MonsterCardTypesEnum type; 
	
	@Column
	private boolean isXyz;
	
	@Column
	private boolean isFusion;
	
	@Column 
	private boolean isSychro;
	
	@Column
	private boolean isPendulum;
	
	@Column
	private boolean isNormal;
	
	@Column 
	private boolean isEffect;
	
	@Column
	private boolean isTuner;
	
	@Column
	private String pendulumEffect;
	
	@Column
	private int linkXyzRank;
}
