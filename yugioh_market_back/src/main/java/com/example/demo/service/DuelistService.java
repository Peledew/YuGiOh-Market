package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Seller;
import com.example.demo.repository.DuelistRepository;



@Service
public class DuelistService {
	
	@Autowired
	private DuelistRepository _duelistRepository;
	
	public Seller save(Seller seller) {
		return _duelistRepository.save(seller);
	}

}
