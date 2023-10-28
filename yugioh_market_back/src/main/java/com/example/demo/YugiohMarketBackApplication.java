package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Card;
import com.example.demo.entity.CardSet;
import com.example.demo.entity.MonsterCard;
import com.example.demo.service.CardService;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class YugiohMarketBackApplication implements CommandLineRunner {

	@Autowired
	private CardService _cardServis;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n\n KOMPAJLIRAJ MICKO!\n\n");
		
		Card karta = new MonsterCard();
		karta.setMark("DUDE-EN023");
		karta.setName("Ra");
		karta.setSeries("DUDE");
		
		CardSet setic = new CardSet();
		setic.setSeriesMark("MAMA");
		setic.setSeriesName("Duelist Nexus");
		setic.setSeriesDescription("NEMAM");
		
		Set<CardSet> setovi = new HashSet<>();
		setovi.add(setic);
		karta.setCardSets(setovi);
		
		Set<Card> karte = new HashSet<>();
		karte.add(karta);
		
		setic.setCards(karte);
		
		
		_cardServis.save(karta);
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(YugiohMarketBackApplication.class, args);

		
	}

	

}
