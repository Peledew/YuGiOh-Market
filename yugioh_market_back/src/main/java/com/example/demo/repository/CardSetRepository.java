package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CardSet;

@Repository
public interface CardSetRepository extends JpaRepository<CardSet, String>{

}
