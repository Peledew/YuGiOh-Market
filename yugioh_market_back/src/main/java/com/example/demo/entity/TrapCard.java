package com.example.demo.entity;

import java.io.Serializable;
import java.util.Set;

import com.example.demo.enumeration.CardRarity;
import com.example.demo.enumeration.TrapType;
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
@DiscriminatorValue("Trap")
public class TrapCard extends Card implements Serializable{
	//Attributes
	@Column
	@Enumerated(EnumType.STRING)
	private TrapType type;

}
