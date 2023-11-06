package com.example.demo.entity;

import java.io.Serializable;
import java.util.Set;

import com.example.demo.enumeration.CardAttribute;
import com.example.demo.enumeration.CardRarity;
import com.example.demo.enumeration.MonsterType;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("Monster")
public class MonsterCard extends Card implements Serializable{
	//Attributes
	@Column
	private int atk;
	
	@Column
	private int def;
	
	@Column
	private int level;
	
	@Column
	@Enumerated(EnumType.STRING)
	private CardAttribute attribute;
	
	@Column
	@Enumerated(EnumType.STRING)
	private MonsterType type;
	
	@Column
	private boolean isXyz;
	
	@Column
	private boolean isFusion;
	
	@Column 
	private boolean isSynchro;
	
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

	@Column
	private String summoningCondition;

}
