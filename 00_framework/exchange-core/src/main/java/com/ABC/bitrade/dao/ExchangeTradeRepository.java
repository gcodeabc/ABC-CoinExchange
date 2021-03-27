package com.ABC.bitrade.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ABC.bitrade.entity.ExchangeOrderDetail;
import com.ABC.bitrade.entity.ExchangeTrade;

public interface ExchangeTradeRepository extends MongoRepository<ExchangeTrade,String> {
}
