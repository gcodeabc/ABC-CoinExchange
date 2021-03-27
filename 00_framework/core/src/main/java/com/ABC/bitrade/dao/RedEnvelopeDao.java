package com.ABC.bitrade.dao;

import java.util.List;

import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.RedEnvelope;

public interface RedEnvelopeDao extends BaseDao<RedEnvelope>{
	
	RedEnvelope findByEnvelopeNo(String envelopeNo);
	
	List<RedEnvelope> findAllByMemberId(Long memberId);
	
	List<RedEnvelope> findAllByState(int state);
}
