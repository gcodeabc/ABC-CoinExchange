package com.ABC.bitrade.dao;

import com.ABC.bitrade.constant.BooleanEnum;
import com.ABC.bitrade.constant.PromotionRewardType;
import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.RewardPromotionSetting;

/**
 * @author GS
 * @date 2018年03月08日
 */
public interface RewardPromotionSettingDao extends BaseDao<RewardPromotionSetting> {
    RewardPromotionSetting findByStatusAndType(BooleanEnum booleanEnum, PromotionRewardType type);
}
