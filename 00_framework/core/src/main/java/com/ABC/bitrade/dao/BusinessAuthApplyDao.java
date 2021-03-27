package com.ABC.bitrade.dao;

import java.util.List;

import com.ABC.bitrade.constant.BooleanEnum;
import com.ABC.bitrade.constant.CertifiedBusinessStatus;
import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.BusinessAuthApply;
import com.ABC.bitrade.entity.Member;

/**
 * @author Shaoxianjun
 * @date 2019/5/7
 */
public interface BusinessAuthApplyDao extends BaseDao<BusinessAuthApply> {

    List<BusinessAuthApply> findByMemberOrderByIdDesc(Member member);

    List<BusinessAuthApply> findByMemberAndCertifiedBusinessStatusOrderByIdDesc(Member member, CertifiedBusinessStatus certifiedBusinessStatus);

    long countAllByCertifiedBusinessStatus(CertifiedBusinessStatus status);

}
