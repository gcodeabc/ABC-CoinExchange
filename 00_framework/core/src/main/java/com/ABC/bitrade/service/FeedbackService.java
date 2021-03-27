package com.ABC.bitrade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ABC.bitrade.dao.FeedbackDao;
import com.ABC.bitrade.entity.Feedback;
import com.ABC.bitrade.service.Base.BaseService;

/**
 * @author GS
 * @date 2018年03月19日
 */
@Service
public class FeedbackService extends BaseService {
    @Autowired
    private FeedbackDao feedbackDao;

    public Feedback save(Feedback feedback){
        return feedbackDao.save(feedback);
    }
}
