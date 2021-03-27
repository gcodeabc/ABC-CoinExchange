package com.ABC.bitrade.dao;

import com.ABC.bitrade.constant.ActivityRewardType;
import com.ABC.bitrade.constant.BooleanEnum;
import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.RewardActivitySetting;

/**
 * @author GS
 * @date 2018年03月08日
 */
public interface RewardActivitySettingDao extends BaseDao<RewardActivitySetting> {
    RewardActivitySetting findByStatusAndType(BooleanEnum booleanEnum, ActivityRewardType type);
}
