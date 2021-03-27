package com.ABC.bitrade.controller.activity;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ABC.bitrade.constant.PageModel;
import com.ABC.bitrade.controller.common.BaseAdminController;
import com.ABC.bitrade.entity.MemberSignRecord;
import com.ABC.bitrade.model.screen.MemberSignRecordScreen;
import com.ABC.bitrade.model.vo.MemberSignRecordVO;
import com.ABC.bitrade.service.MemberSignRecordService;
import com.ABC.bitrade.util.MessageResult;

/**
 * @author Shaoxianjun
 * @Description: 会员签到记录
 * @date 2019/5/4
 */
@RestController
@RequestMapping("activity/member-sign-record")
public class MemberSignRecordControler extends BaseAdminController {
    @Autowired
    private MemberSignRecordService service;

    @RequiresPermissions("activity:member-sign-record:page-query")
    @GetMapping("page-query")
    public MessageResult pageQuery(MemberSignRecordScreen screen, PageModel pageModel) {
        Page<MemberSignRecord> source = service.findAllScreen(screen, pageModel);
        Page<MemberSignRecordVO> page = source.map(x -> MemberSignRecordVO.getMemberSignRecordVO(x));
        return success(page);
    }
}
