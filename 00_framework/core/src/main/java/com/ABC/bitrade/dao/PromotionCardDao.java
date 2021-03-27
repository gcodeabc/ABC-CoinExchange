package com.ABC.bitrade.dao;

import java.util.List;

import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.OtcCoin;
import com.ABC.bitrade.entity.PromotionCard;

public interface PromotionCardDao extends BaseDao<PromotionCard> {
	
	PromotionCard findByCardNo(String cardNo);
	
	List<PromotionCard> findAllByMemberId(Long memberId);

	List<PromotionCard> findAllByMemberIdAndIsFree(long memberId, int isFree);
}
