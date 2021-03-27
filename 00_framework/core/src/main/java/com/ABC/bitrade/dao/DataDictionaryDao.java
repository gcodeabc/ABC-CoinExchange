package com.ABC.bitrade.dao;

import com.ABC.bitrade.dao.base.BaseDao;
import com.ABC.bitrade.entity.DataDictionary;

/**
 * @author GS
 * @Title: ${file_name}
 * @Description:
 * @date 2018/4/1214:15
 */
public interface DataDictionaryDao extends BaseDao<DataDictionary> {
    DataDictionary findByBond(String bond);
}
