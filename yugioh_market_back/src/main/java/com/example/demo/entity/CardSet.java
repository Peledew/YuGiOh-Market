package com.example.demo.entity;

import java.io.Serializable; 
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class CardSet implements Serializable {

	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String seriesMark;
	
	@Column
	private String seriesName;
	
	@Column
	private String seriesDescription;

	@OneToMany(mappedBy = "cardSet")
	Set<CardPrints> prints;

	//Constructors
	public CardSet() {}

	public CardSet(int id, String seriesMark, String seriesName, String seriesDescription, Set<CardPrints> prints) {
		this.id = id;
		this.seriesMark = seriesMark;
		this.seriesName = seriesName;
		this.seriesDescription = seriesDescription;
		this.prints = prints;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Set<CardPrints> getPrints() {
		return prints;
	}

	public void setPrints(Set<CardPrints> prints) {
		this.prints = prints;
	}
}
