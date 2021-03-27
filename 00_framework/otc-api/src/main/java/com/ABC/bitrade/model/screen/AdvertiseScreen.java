package com.ABC.bitrade.model.screen;

import com.ABC.bitrade.ability.ScreenAbility;
import com.ABC.bitrade.constant.AdvertiseControlStatus;
import com.ABC.bitrade.entity.QAdvertise;
import com.querydsl.core.types.dsl.BooleanExpression;

import lombok.Data;

import java.util.ArrayList;

/**
 * @author GS
 * @Title: ${file_name}
 * @Description:
 * @date 2018/4/2711:45
 */
@Data
public class AdvertiseScreen implements ScreenAbility {

    AdvertiseControlStatus status;

    /**
     * 处理内部断言
     *
     * @return
     */
    @Override
    public ArrayList<BooleanExpression> getBooleanExpressions() {
        ArrayList<BooleanExpression> booleanExpressions = new ArrayList<>();
        if (status != null) {
            booleanExpressions.add(QAdvertise.advertise.status.eq(status));
        }
        return booleanExpressions;
    }


}
