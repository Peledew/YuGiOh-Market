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
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "location_ID", referencedColumnName = "id")
	private Location location;
	
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
	
	public Duelist(int id, String name, String lastname, String username, String email, String password,
			Location location, double rating, Set<Card> cardCollection) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.location = location;
		this.rating = rating;
		this.cardCollection = cardCollection;
	}

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

	//Methods
	@Override
	public String toString() {
		return "Duelist [id=" + id + ", name=" + name + ", lastname=" + lastname + ", username=" + username + ", email="
				+ email + ", password=" + password + ", location=" + location + ", rating=" + rating
				+ ", cardCollection=" + cardCollection + "]";
	}

	
}
