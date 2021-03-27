package com.ABC.bitrade.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.CtcAcceptor;
import com.ABC.bitrade.entity.Member;

@Repository
public interface CtcAcceptorDao  extends  BaseDao<CtcAcceptor>  {
	List<CtcAcceptor> findAllByStatus(int status);
	List<CtcAcceptor> findAllByMember(Member member);
}
