package com.example.demo.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Duelist implements Serializable {

	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String lastname;
	
	@Column
	private String username;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private String country;
	
	@Column
	private String city;
	
	@Column
	private String adress;
	
	@Column
	private double rating;
	
	@ManyToMany
    @JoinTable(
        name = "duelist_binder",
        joinColumns = @JoinColumn(name = "duelist_id"),
        inverseJoinColumns = @JoinColumn(name = "card_id")
    )
    private Set<Card> cardCollection = new HashSet<>();
	
	//Constructors
	public Duelist() {}
	
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public Set<Card> getCardCollection() {
		return cardCollection;
	}
	public void setCardCollection(Set<Card> cardCollection) {
		this.cardCollection = cardCollection;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lastname=" + lastname + ", username=" + username + ", email="
				+ email + ", password=" + password + ", country=" + country + ", city=" + city + ", adress=" + adress
				+ ", rating=" + rating + "]";
	}
}
