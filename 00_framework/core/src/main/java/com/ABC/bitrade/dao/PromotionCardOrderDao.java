package com.ABC.bitrade.dao;

import java.util.List;

import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.OtcCoin;
import com.ABC.bitrade.entity.PromotionCardOrder;

public interface PromotionCardOrderDao extends BaseDao<PromotionCardOrder> {
	List<PromotionCardOrder> findAllByCardIdAndMemberId(Long cardId, Long memberId);
	
	List<PromotionCardOrder> findAllByCardId(Long cardId);


	List<PromotionCardOrder> findAllByMemberIdAndIsFree(long memberId, int isFree);
}
