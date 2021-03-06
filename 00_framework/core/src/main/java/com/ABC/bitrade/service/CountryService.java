package com.ABC.bitrade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ABC.bitrade.dao.CountryDao;
import com.ABC.bitrade.entity.Country;

import java.util.List;

/**
 * @author GS
 * @date 2018年02月10日
 */
@Service
public class CountryService {
    @Autowired
    private CountryDao countryDao;

    public List<Country> getAllCountry(){
        return countryDao.findAllOrderBySort();
    }

    public Country findOne(String zhName){
        return countryDao.findByZhName(zhName);
    }

}
