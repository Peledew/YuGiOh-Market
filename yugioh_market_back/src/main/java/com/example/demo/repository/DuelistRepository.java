package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Seller;



@Repository
public interface  DuelistRepository extends JpaRepository<Seller, Long>{


}
