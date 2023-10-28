package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Trap")
public class TrapCard extends Card implements Serializable{
	private String trapppbroo;

}
