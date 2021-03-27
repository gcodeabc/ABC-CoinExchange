package com.ABC.bitrade.dao;

import java.util.List;

import com.ABC.bitrade.constant.CertifiedBusinessStatus;
import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.BusinessCancelApply;
import com.ABC.bitrade.entity.Member;

/**
 * @author jiangtao
 * @date 2018/5/17
 */
public interface BusinessCancelApplyDao extends BaseDao<BusinessCancelApply>{

    List<BusinessCancelApply> findByMemberAndStatusOrderByIdDesc(Member member , CertifiedBusinessStatus status);

    List<BusinessCancelApply> findByMemberOrderByIdDesc(Member member);

    long countAllByStatus(CertifiedBusinessStatus status);
}
