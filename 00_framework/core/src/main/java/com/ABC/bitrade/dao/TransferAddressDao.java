package com.ABC.bitrade.dao;

import java.util.List;

import com.ABC.bitrade.constant.CommonStatus;
import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.Coin;
import com.ABC.bitrade.entity.TransferAddress;

/**
 * @author GS
 * @date 2018年02月27日
 */
public interface TransferAddressDao extends BaseDao<TransferAddress> {
    List<TransferAddress> findAllByStatusAndCoin(CommonStatus status, Coin coin);

    TransferAddress findByAddressAndCoin(String address, Coin coin);
}
