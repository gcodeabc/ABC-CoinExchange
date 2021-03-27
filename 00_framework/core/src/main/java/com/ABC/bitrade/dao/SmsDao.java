package com.ABC.bitrade.dao;

import org.springframework.data.jpa.repository.Query;

import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.dto.SmsDTO;

import java.util.List;

/**
 * @Description:
 * @author: GuoShuai
 * @date: create in 9:47 2018/6/28
 * @Modified:
 */
public interface SmsDao extends BaseDao<SmsDTO> {
    
    @Query(value = "select * from tb_sms where sms_status = '0' ",nativeQuery = true)
    SmsDTO findBySmsStatus();
}
