package com.ABC.bitrade.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.MiningOrder;
import com.ABC.bitrade.entity.MiningOrderDetail;

@Repository
public interface MiningOrderDetailDao  extends BaseDao<MiningOrderDetail> {
	
	List<MiningOrderDetail> findAllByMemberId(Long memberId);
	
}
