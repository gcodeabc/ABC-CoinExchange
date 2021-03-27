package com.ABC.bitrade.dao;

import java.util.List;

import com.ABC.bitrade.constant.CommonStatus;
import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.BusinessAuthDeposit;

/**
 * @author Shaoxianjun
 * @date 2019/5/5
 */
public interface BusinessAuthDepositDao extends BaseDao<BusinessAuthDeposit> {
    public List<BusinessAuthDeposit> findAllByStatus(CommonStatus status);
}
