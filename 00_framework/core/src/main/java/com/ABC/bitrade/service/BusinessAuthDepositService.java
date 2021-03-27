package com.ABC.bitrade.service;

import com.ABC.bitrade.constant.CommonStatus;
import com.ABC.bitrade.constant.PageModel;
import com.ABC.bitrade.dao.BusinessAuthDepositDao;
import com.ABC.bitrade.entity.BusinessAuthApply;
import com.ABC.bitrade.entity.BusinessAuthDeposit;
import com.ABC.bitrade.service.Base.BaseService;
import com.querydsl.core.types.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Shaoxianjun
 * @date 2019/5/5
 */
@Service
public class BusinessAuthDepositService extends BaseService {
    @Autowired
    private BusinessAuthDepositDao businessAuthDepositDao;

    @Override
    public Page<BusinessAuthDeposit> findAll(Predicate predicate, PageModel pageModel) {
        return businessAuthDepositDao.findAll(predicate, pageModel.getPageable());
    }

    public List<BusinessAuthDeposit> findAllByStatus(CommonStatus status){
        return businessAuthDepositDao.findAllByStatus(status);
    }

    public BusinessAuthDeposit findById(Long id){
        return businessAuthDepositDao.findOne(id);
    }

    public void save(BusinessAuthDeposit businessAuthDeposit){
        businessAuthDepositDao.save(businessAuthDeposit);
    }

    public void update(BusinessAuthDeposit businessAuthDeposit){
        businessAuthDepositDao.save(businessAuthDeposit);
    }
}
