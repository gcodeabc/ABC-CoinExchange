package com.ABC.bitrade.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ABC.bitrade.entity.MemberLog;


public interface MemberLogDao extends MongoRepository<MemberLog,Long> {
}
