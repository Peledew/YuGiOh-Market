package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Duelist;
import com.example.demo.repository.DuelistRepository;



@Service
public class DuelistService {
	
	@Autowired
	private DuelistRepository _duelistRepository;
	
	public Duelist save(Duelist duelist) {
		return _duelistRepository.save(duelist);
	}

}
