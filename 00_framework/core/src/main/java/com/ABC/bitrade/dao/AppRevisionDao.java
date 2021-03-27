package com.ABC.bitrade.dao;

import com.ABC.bitrade.constant.Platform;
import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.AppRevision;

/**
 * @author GS
 * @Title: ${file_name}
 * @Description:
 * @date 2018/4/2416:18
 */
public interface AppRevisionDao extends BaseDao<AppRevision> {
    AppRevision findAppRevisionByPlatformOrderByIdDesc(Platform platform);
}
