package com.ABC.bitrade.job;
/*
package com.ABC.bitrade.job;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.ABC.bitrade.entity.QSysAdvertise;
import com.ABC.bitrade.entity.SysAdvertise;
import com.ABC.bitrade.service.SysAdvertiseService;
import com.ABC.bitrade.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class SystemAdvertiseJob {

    @Autowired
    private SysAdvertiseService sysAdvertiseService ;

    @Scheduled(cron = "1 0 0 * * *")
    public void undercarriageAdvertise(){

        String dateStr = DateUtil.getDate() ;

        List<Predicate> conditions = new ArrayList<>() ;

        QSysAdvertise qSysAdvertise = QSysAdvertise.sysAdvertise ;

        conditions.add(qSysAdvertise.endTime.like(dateStr+"%")) ;

        List<SysAdvertise> list = sysAdvertiseService.findAll(conditions);

        if(list!=null&&list.size()>0){

            for(SysAdvertise sysAdvertise : list){

            }
        }


    }
}
*/
