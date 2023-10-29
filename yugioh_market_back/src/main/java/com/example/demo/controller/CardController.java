package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CardService;

@RestController
public class CardController {
	
	@Autowired
	private CardService _cardService;
	

}
