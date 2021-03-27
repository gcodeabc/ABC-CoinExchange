package com.ABC.bitrade.dao;

import com.ABC.bitrade.constant.SignStatus;
import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.Sign;

/**
 * @author GS
 * @Description:
 * @date 2018/5/311:10
 */
public interface SignDao extends BaseDao<Sign> {
    Sign findByStatus(SignStatus status);
}
