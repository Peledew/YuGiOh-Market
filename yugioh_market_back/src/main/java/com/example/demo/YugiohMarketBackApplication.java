package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Card;
import com.example.demo.entity.CardSet;
import com.example.demo.entity.Seller;
import com.example.demo.entity.MonsterCard;
import com.example.demo.service.CardService;
import com.example.demo.service.DuelistService;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class YugiohMarketBackApplication implements CommandLineRunner {

	@Autowired
	private CardService _cardServis;
	
	@Autowired
	private DuelistService _duelistServis;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n\n KOMPAJLIRAJ MICKO!\n\n");
		
		Card karta = new MonsterCard();
		//karta.setMark("DUDE-EN023");
		karta.setName("Ra");
		//karta.setSeries("DUDE");
		
		CardSet setic = new CardSet();
		//setic.setId("MAMA");
		setic.setSeriesName("Duelist Nexus");
		setic.setSeriesDescription("NEMAM");
		
		Set<CardSet> setovi = new HashSet<>();
		setovi.add(setic);
		//karta.setCardSets(setovi);
		
		Set<Card> karte = new HashSet<>();
		karte.add(karta);
		
		//setic.setCards(karte);
		
		
		_cardServis.save(karta);
		
		Seller kaiba = new Seller();
		//kaiba.setName("Kaiba");
		//kaiba.setUsername("kaiba68");
		//kaiba.setCardCollection(karte);
		
		_duelistServis.save(kaiba);
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(YugiohMarketBackApplication.class, args);

		
	}

	

}
