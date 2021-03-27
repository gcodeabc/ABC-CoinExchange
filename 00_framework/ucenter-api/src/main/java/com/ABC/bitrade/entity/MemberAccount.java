package com.ABC.bitrade.entity;

import com.ABC.bitrade.constant.BooleanEnum;
import com.ABC.bitrade.entity.Alipay;
import com.ABC.bitrade.entity.BankInfo;
import com.ABC.bitrade.entity.WechatPay;

import lombok.Builder;
import lombok.Data;

/**
 * @author GS
 * @date 2018年01月16日
 */
@Builder
@Data
public class MemberAccount {
    private String realName;
    private BooleanEnum bankVerified;
    private BooleanEnum aliVerified;
    private BooleanEnum wechatVerified;
    private BankInfo bankInfo;
    private Alipay alipay;
    private WechatPay wechatPay;
}
