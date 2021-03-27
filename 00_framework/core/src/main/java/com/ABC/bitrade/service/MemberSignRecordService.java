package com.ABC.bitrade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ABC.bitrade.dao.MemberSignRecordDao;
import com.ABC.bitrade.entity.MemberSignRecord;
import com.ABC.bitrade.service.Base.TopBaseService;

/**
 * @author GS
 * @Description:
 * @date 2018/5/410:19
 */
@Service
public class MemberSignRecordService extends TopBaseService<MemberSignRecord, MemberSignRecordDao> {
    @Override
    @Autowired
    public void setDao(MemberSignRecordDao dao) {
        super.setDao(dao);
    }
}
