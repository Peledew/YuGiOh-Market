package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CardSetService;

@RestController
public class CardSetController {
	
	@Autowired
	private CardSetService _cardSetService;

}
