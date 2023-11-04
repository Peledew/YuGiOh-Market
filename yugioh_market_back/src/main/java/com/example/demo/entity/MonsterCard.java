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

	//Constructors
	public MonsterCard(){}

	public MonsterCard(int atk, int def, int level, CardAttribute attribute, MonsterType type, boolean isXyz, boolean isFusion, boolean isSynchro, boolean isPendulum, boolean isNormal, boolean isEffect, boolean isTuner, String pendulumEffect, int linkXyzRank, String summoningCondition) {
		this.atk = atk;
		this.def = def;
		this.level = level;
		this.attribute = attribute;
		this.type = type;
		this.isXyz = isXyz;
		this.isFusion = isFusion;
		this.isSynchro = isSynchro;
		this.isPendulum = isPendulum;
		this.isNormal = isNormal;
		this.isEffect = isEffect;
		this.isTuner = isTuner;
		this.pendulumEffect = pendulumEffect;
		this.linkXyzRank = linkXyzRank;
		this.summoningCondition = summoningCondition;
	}

	public MonsterCard(int id, String name, String description, CardRarity rarity, Set<SellerBinder> binder, Set<CardPrints> prints, int atk, int def, int level, CardAttribute attribute, MonsterType type, boolean isXyz, boolean isFusion, boolean isSynchro, boolean isPendulum, boolean isNormal, boolean isEffect, boolean isTuner, String pendulumEffect, int linkXyzRank, String summoningCondition) {
		super(id, name, description, rarity, binder, prints);
		this.atk = atk;
		this.def = def;
		this.level = level;
		this.attribute = attribute;
		this.type = type;
		this.isXyz = isXyz;
		this.isFusion = isFusion;
		this.isSynchro = isSynchro;
		this.isPendulum = isPendulum;
		this.isNormal = isNormal;
		this.isEffect = isEffect;
		this.isTuner = isTuner;
		this.pendulumEffect = pendulumEffect;
		this.linkXyzRank = linkXyzRank;
		this.summoningCondition = summoningCondition;
	}

	//Getters and Setters

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public CardAttribute getAttribute() {
		return attribute;
	}

	public void setAttribute(CardAttribute attribute) {
		this.attribute = attribute;
	}

	public MonsterType getType() {
		return type;
	}

	public void setType(MonsterType type) {
		this.type = type;
	}

	public boolean isXyz() {
		return isXyz;
	}

	public void setXyz(boolean xyz) {
		isXyz = xyz;
	}

	public boolean isFusion() {
		return isFusion;
	}

	public void setFusion(boolean fusion) {
		isFusion = fusion;
	}

	public boolean isSynchro() {
		return isSynchro;
	}

	public void setSynchro(boolean synchro) {
		isSynchro = synchro;
	}

	public boolean isPendulum() {
		return isPendulum;
	}

	public void setPendulum(boolean pendulum) {
		isPendulum = pendulum;
	}

	public boolean isNormal() {
		return isNormal;
	}

	public void setNormal(boolean normal) {
		isNormal = normal;
	}

	public boolean isEffect() {
		return isEffect;
	}

	public void setEffect(boolean effect) {
		isEffect = effect;
	}

	public boolean isTuner() {
		return isTuner;
	}

	public void setTuner(boolean tuner) {
		isTuner = tuner;
	}

	public String getPendulumEffect() {
		return pendulumEffect;
	}

	public void setPendulumEffect(String pendulumEffect) {
		this.pendulumEffect = pendulumEffect;
	}

	public int getLinkXyzRank() {
		return linkXyzRank;
	}

	public void setLinkXyzRank(int linkXyzRank) {
		this.linkXyzRank = linkXyzRank;
	}

	public String getSummoningCondition() {
		return summoningCondition;
	}

	public void setSummoningCondition(String summoningCondition) {
		this.summoningCondition = summoningCondition;
	}
}
