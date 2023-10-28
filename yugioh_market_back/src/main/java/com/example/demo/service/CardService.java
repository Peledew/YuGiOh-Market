package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Card;
import com.example.demo.repository.CardRepository;


@Service
public class CardService {

	@Autowired
	private CardRepository _cardRepository;
	
	public Card save(Card card) {
		return _cardRepository.save(card);
	}
}
