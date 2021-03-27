package com.ABC.bitrade.dao;

import java.util.List;

import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.RedEnvelopeDetail;

public interface RedEnvelopeDetailDao  extends BaseDao<RedEnvelopeDetail>{
	
	List<RedEnvelopeDetail> findAllByEnvelopeIdAndMemberId(Long envelopeId, Long memberId);
	
	List<RedEnvelopeDetail> findAllByEnvelopeId(Long envelopeId);
}
