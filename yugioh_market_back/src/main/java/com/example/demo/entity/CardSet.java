package com.example.demo.entity;

import java.io.Serializable; 
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class CardSet implements Serializable {

	//Attributes
	@Id
	private String seriesMark;
	
	@Column
	private String seriesName;
	
	@Column
	private String seriesDescription;
	
	@ManyToMany(mappedBy = "cardSets")
    private Set<Card> cards = new HashSet<>();
	
	//Constructors
	public CardSet() {}

	
	//Getters and Setters
	public String getSeriesMark() {
		return seriesMark;
	}

	public void setSeriesMark(String seriesMark) {
		this.seriesMark = seriesMark;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getSeriesDescription() {
		return seriesDescription;
	}

	public void setSeriesDescription(String seriesDescription) {
		this.seriesDescription = seriesDescription;
	}

	public Set<Card> getCards() {
		return cards;
	}

	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}
	
	
	
}
