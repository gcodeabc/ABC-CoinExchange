package com.ABC.bitrade.controller.promotion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ABC.bitrade.constant.PageModel;
import com.ABC.bitrade.model.RewardRecordScreen;
import com.ABC.bitrade.service.RewardRecordService;
import com.ABC.bitrade.util.MessageResult;

/**
 * 奖励记录
 * @author shaox
 *
 */
@RestController
@RequestMapping("promotion/reward-record")
public class RewardRecordController {

    @Autowired
    private RewardRecordService rewardRecordService ;

    @PostMapping("page-query")
    public MessageResult page(PageModel pageModel, RewardRecordScreen screen){
        return null;
    }
}
