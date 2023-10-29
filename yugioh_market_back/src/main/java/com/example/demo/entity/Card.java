package com.example.demo.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "card_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Card implements Serializable {

	//Attributes
	@Id
	protected String mark;
	
	@Column
	protected String name;
	
	@Column
	protected String description;
	
	@Column
	protected String series;
	
	@ManyToMany
    @JoinTable(
        name = "card_set_finder",
        joinColumns = @JoinColumn(name = "card_id"),
        inverseJoinColumns = @JoinColumn(name = "cardset_id")
    )
	protected Set<CardSet> cardSets = new HashSet<>();
	
	@ManyToMany(mappedBy = "cardCollection")
	protected Set<Duelist> allDuelists = new HashSet<>();
	
	//Constructors
	public Card() {}

	public Card(String mark, String name, String description, String series, Set<CardSet> cardSets,
			Set<Duelist> allDuelists) {
		super();
		this.mark = mark;
		this.name = name;
		this.description = description;
		this.series = series;
		this.cardSets = cardSets;
		this.allDuelists = allDuelists;
	}


	//Getters and Setters
	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
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

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Set<CardSet> getCardSets() {
		return cardSets;
	}

	public void setCardSets(Set<CardSet> cardSets) {
		this.cardSets = cardSets;
	}

	public Set<Duelist> getAllDuelists() {
		return allDuelists;
	}

	public void setAllDuelists(Set<Duelist> allDuelists) {
		this.allDuelists = allDuelists;
	}

	//Methods
	@Override
	public String toString() {
		return "Card [mark=" + mark + ", name=" + name + ", description=" + description + ", series=" + series
				+ ", cardSets=" + cardSets + ", allDuelists=" + allDuelists + "]";
	}
	
}
