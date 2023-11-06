package com.example.demo.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Seller extends Duelist implements Serializable {

	//Attributes
	@Column
	private double rating;

	@OneToMany(mappedBy = "seller")
	Set<SellerBinder> binder;


}
