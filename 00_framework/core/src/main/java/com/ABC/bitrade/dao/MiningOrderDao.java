package com.ABC.bitrade.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.MiningOrder;

@Repository
public interface MiningOrderDao extends BaseDao<MiningOrder> {

	List<MiningOrder> findAllByMemberId(Long memberId);
	
	List<MiningOrder> findAllByMemberIdAndActivityId(Long memberId, Long activityId);
	
	List<MiningOrder> findAllByActivityId(Long activityId);
	
	List<MiningOrder> findAllByMiningStatus(int miningStatus);
}
