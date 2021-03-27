package com.ABC.bitrade.dao;

import java.util.List;

import com.ABC.bitrade.constant.DepositStatusEnum;
import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.DepositRecord;
import com.ABC.bitrade.entity.Member;

/**
 * @author Shaoxianjun
 * @date 2019/5/7
 */
public interface DepositRecordDao extends BaseDao<DepositRecord> {
    public DepositRecord findById(String id);

    public List<DepositRecord> findByMemberAndStatus(Member member, DepositStatusEnum status);
}
