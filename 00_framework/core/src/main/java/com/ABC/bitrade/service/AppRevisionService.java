package com.ABC.bitrade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ABC.bitrade.constant.Platform;
import com.ABC.bitrade.dao.AppRevisionDao;
import com.ABC.bitrade.entity.AppRevision;
import com.ABC.bitrade.service.Base.TopBaseService;

/**
 * @author GS
 * @Title: ${file_name}
 * @Description:
 * @date 2018/4/2416:19
 */
@Service
public class AppRevisionService extends TopBaseService<AppRevision, AppRevisionDao> {

    @Override
    @Autowired
    public void setDao(AppRevisionDao dao) {
        super.setDao(dao);
    }

    public AppRevision findRecentVersion(Platform p){
        return dao.findAppRevisionByPlatformOrderByIdDesc(p);
    }
}
