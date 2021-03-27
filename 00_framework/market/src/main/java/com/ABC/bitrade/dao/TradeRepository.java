package com.ABC.bitrade.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ABC.bitrade.entity.ExchangeTrade;

public interface TradeRepository extends MongoRepository<ExchangeTrade,Long>{
}
