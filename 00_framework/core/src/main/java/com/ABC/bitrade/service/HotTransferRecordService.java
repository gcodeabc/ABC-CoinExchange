package com.ABC.bitrade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ABC.bitrade.dao.HotTransferRecordDao;
import com.ABC.bitrade.entity.HotTransferRecord;
import com.ABC.bitrade.service.Base.TopBaseService;

@Service
public class HotTransferRecordService extends TopBaseService<HotTransferRecord,HotTransferRecordDao> {

    @Override
    @Autowired
    public void setDao(HotTransferRecordDao dao) {
        super.setDao(dao);
    }
}
