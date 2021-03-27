package com.ABC.bitrade.controller;

import lombok.extern.slf4j.Slf4j;

import static com.ABC.bitrade.constant.SysConstant.SESSION_MEMBER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ABC.bitrade.entity.Feedback;
import com.ABC.bitrade.entity.Member;
import com.ABC.bitrade.entity.transform.AuthMember;
import com.ABC.bitrade.service.FeedbackService;
import com.ABC.bitrade.service.LocaleMessageSourceService;
import com.ABC.bitrade.service.MemberService;
import com.ABC.bitrade.util.MessageResult;

/**
 * @author GS
 * @date 2018年03月19日
 */
@RestController
@Slf4j
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;
    @Autowired
    private MemberService memberService;
    @Autowired
    private LocaleMessageSourceService msService;

    /**
     * 提交反馈意见
     *
     * @param user
     * @param remark
     * @return
     */
    @RequestMapping("feedback")
    @Transactional(rollbackFor = Exception.class)
    public MessageResult feedback(@SessionAttribute(SESSION_MEMBER) AuthMember user, String remark) {
        Feedback feedback = new Feedback();
        Member member = memberService.findOne(user.getId());
        feedback.setMember(member);
        feedback.setRemark(remark);
        Feedback feedback1 = feedbackService.save(feedback);
        if (feedback1 != null) {
            return MessageResult.success();
        } else {
            return MessageResult.error(msService.getMessage("SYSTEM_ERROR"));
        }
    }
}
