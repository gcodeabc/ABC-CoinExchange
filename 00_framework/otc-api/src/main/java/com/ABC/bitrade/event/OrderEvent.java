package com.ABC.bitrade.event;

import com.alibaba.fastjson.JSONObject;
import com.ABC.bitrade.coin.CoinExchangeFactory;
import com.ABC.bitrade.constant.PromotionRewardType;
import com.ABC.bitrade.constant.RewardRecordType;
import com.ABC.bitrade.dao.MemberDao;
import com.ABC.bitrade.entity.*;
import com.ABC.bitrade.service.MemberWalletService;
import com.ABC.bitrade.service.RewardPromotionSettingService;
import com.ABC.bitrade.service.RewardRecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.ABC.bitrade.util.BigDecimalUtils.*;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author GS
 * @date 2018年01月22日
 */
@Service
public class OrderEvent {
    @Autowired
    private MemberDao memberDao;
    @Autowired
    private MemberWalletService memberWalletService;
    @Autowired
    private RewardRecordService rewardRecordService;
    @Autowired
    private RewardPromotionSettingService rewardPromotionSettingService;
    @Autowired
    private CoinExchangeFactory coins;

    public void onOrderCompleted(Order order) {
        Member member = memberDao.findOne(order.getMemberId());
        member.setTransactions(member.getTransactions() + 1);
        Member member1 = memberDao.findOne(order.getCustomerId());
        member1.setTransactions(member1.getTransactions() + 1);
        RewardPromotionSetting rewardPromotionSetting = rewardPromotionSettingService.findByType(PromotionRewardType.TRANSACTION);
        if (rewardPromotionSetting != null && coins.get("USDT").compareTo(BigDecimal.ZERO) > 0) {
            Member[] array = {member, member1};
            Arrays.stream(array).forEach(
                    x -> {
                        //如果要根据某个时间来返佣金，把下面这行替换一下
                        //if (x.getInviterId() != null&&!(DateUtil.diffDays(new Date(), x.getRegistrationTime()) > rewardPromotionSetting.getEffectiveTime())) {
                        //只有首次交易获得佣金
                        if (x.getTransactions() == 1 && x.getInviterId() != null) {
                            Member member2 = memberDao.findOne(x.getInviterId());
                            MemberWallet memberWallet1 = memberWalletService.findByCoinAndMember(rewardPromotionSetting.getCoin(), member2);
                            BigDecimal number = mulRound(order.getNumber(), div(coins.get(order.getCoin().getUnit()), coins.get("USDT")));
                            BigDecimal amount1 = mulRound(number, getRate(JSONObject.parseObject(rewardPromotionSetting.getInfo()).getBigDecimal("one")));
                            memberWallet1.setBalance(add(memberWallet1.getBalance(), amount1));
                            memberWalletService.save(memberWallet1);
                            RewardRecord rewardRecord1 = new RewardRecord();
                            rewardRecord1.setAmount(amount1);
                            rewardRecord1.setCoin(rewardPromotionSetting.getCoin());
                            rewardRecord1.setMember(member2);
                            rewardRecord1.setRemark(rewardPromotionSetting.getType().getCnName());
                            rewardRecord1.setType(RewardRecordType.PROMOTION);
                            rewardRecordService.save(rewardRecord1);
                            if (member2.getInviterId() != null) {
                                Member member3 = memberDao.findOne(member2.getInviterId());
                                MemberWallet memberWallet2 = memberWalletService.findByCoinAndMember(rewardPromotionSetting.getCoin(), member3);
                                BigDecimal amount2 = mulRound(number, getRate(JSONObject.parseObject(rewardPromotionSetting.getInfo()).getBigDecimal("two")));
                                memberWallet2.setBalance(add(memberWallet2.getBalance(), amount2));
                                RewardRecord rewardRecord2 = new RewardRecord();
                                rewardRecord2.setAmount(amount2);
                                rewardRecord2.setCoin(rewardPromotionSetting.getCoin());
                                rewardRecord2.setMember(member3);
                                rewardRecord2.setRemark(rewardPromotionSetting.getType().getCnName());
                                rewardRecord2.setType(RewardRecordType.PROMOTION);
                                rewardRecordService.save(rewardRecord2);
                            }
                        }
                    }
            );
        }
    }
}
