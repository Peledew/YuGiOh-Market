package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CardSet;
import com.example.demo.repository.CardSetRepository;

@Service
public class CardSetService {
	@Autowired
	private CardSetRepository _cardSetRepository;
	
	public CardSet save(CardSet cardSet) {
		return _cardSetRepository.save(cardSet);
	}
	
}
