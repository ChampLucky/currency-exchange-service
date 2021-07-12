package com.lucky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucky.model.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{

	
	 CurrencyExchange findByFromAndTo(String from,String to);
}
