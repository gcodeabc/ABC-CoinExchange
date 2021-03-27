package com.ABC.bitrade.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.ABC.bitrade.constant.CommonStatus;
import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.Activity;
import com.ABC.bitrade.entity.Coin;
import com.ABC.bitrade.entity.MemberTransaction;

@Repository
public interface ActivityDao extends  BaseDao<Activity> {
	
    List<Activity> findAllByStep(int step);

}
