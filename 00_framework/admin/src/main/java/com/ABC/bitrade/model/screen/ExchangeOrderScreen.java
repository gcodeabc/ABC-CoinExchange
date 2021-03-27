package com.ABC.bitrade.model.screen;

import lombok.Data;

import java.math.BigDecimal;

import com.ABC.bitrade.constant.BooleanEnum;
import com.ABC.bitrade.entity.ExchangeOrderDirection;
import com.ABC.bitrade.entity.ExchangeOrderStatus;
import com.ABC.bitrade.entity.ExchangeOrderType;

@Data
public class ExchangeOrderScreen {
    ExchangeOrderType type;
    String coinSymbol;//币单位
    String baseSymbol ;//结算单位
    ExchangeOrderStatus status; //TRADING(交易中),COMPLETED（已完成）,CANCELED（已取消）,OVERTIMED（超时）;
    Long memberId;
    //成交价
    BigDecimal minPrice ;
    BigDecimal maxPrice ;
    //成交量
    BigDecimal minTradeAmount;
    BigDecimal maxTradeAmount;
    //成交额
    BigDecimal minTurnOver;
    BigDecimal maxTurnOver;
    String orderId ;
    ExchangeOrderDirection orderDirection ;
    //是否查看机器人订单 1="是" 0="否"
    Integer robotOrder;

    /**
     * 01（委托订单  历史订单）
     */
    BooleanEnum completed ;
}
