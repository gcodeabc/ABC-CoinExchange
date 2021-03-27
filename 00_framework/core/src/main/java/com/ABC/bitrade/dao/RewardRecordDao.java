package com.ABC.bitrade.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ABC.bitrade.constant.PromotionRewardType;
import com.ABC.bitrade.constant.RewardRecordType;
import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.Member;
import com.ABC.bitrade.entity.RewardRecord;

import java.util.List;

/**
 * @author GS
 * @date 2018年03月08日
 */
public interface RewardRecordDao extends BaseDao<RewardRecord> {
    List<RewardRecord> findAllByMemberAndType(Member member, RewardRecordType type);

    @Query(value = "select coin_id , sum(amount) from reward_record where member_id = :memberId and type = :type group by coin_id",nativeQuery = true)
    List<Object[]> getAllPromotionReward(@Param("memberId") long memberId ,@Param("type") int type);
}
