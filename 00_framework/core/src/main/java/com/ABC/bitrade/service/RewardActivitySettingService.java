package com.ABC.bitrade.service;

import com.ABC.bitrade.constant.ActivityRewardType;
import com.ABC.bitrade.constant.BooleanEnum;
import com.ABC.bitrade.dao.RewardActivitySettingDao;
import com.ABC.bitrade.dto.PageParam;
import com.ABC.bitrade.entity.QRewardActivitySetting;
import com.ABC.bitrade.entity.QRewardPromotionSetting;
import com.ABC.bitrade.entity.RewardActivitySetting;
import com.ABC.bitrade.entity.RewardPromotionSetting;
import com.ABC.bitrade.service.Base.BaseService;
import com.ABC.bitrade.service.Base.TopBaseService;
import com.querydsl.core.types.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author GS
 * @date 2018年03月08日
 */
@Service
public class RewardActivitySettingService extends TopBaseService<RewardActivitySetting,RewardActivitySettingDao> {

    @Override
    @Autowired
    public void setDao(RewardActivitySettingDao dao) {
        this.dao = dao ;
    }


    public RewardActivitySetting findByType(ActivityRewardType type){
        return dao.findByStatusAndType(BooleanEnum.IS_TRUE, type);
    }

    @Override
    public RewardActivitySetting save(RewardActivitySetting rewardActivitySetting){
        return dao.save(rewardActivitySetting);
    }

   /* public List<RewardActivitySetting> page(Predicate predicate){
        Pageable pageable = new PageRequest()
        Iterable<RewardActivitySetting> iterable = rewardActivitySettingDao.findAll(predicate, QRewardActivitySetting.rewardActivitySetting.updateTime.desc());
        return (List<RewardActivitySetting>) iterable ;
    }*/


}
