package com.ABC.bitrade.model.screen;

import com.ABC.bitrade.constant.AdvertiseControlStatus;
import com.ABC.bitrade.constant.AdvertiseType;

import lombok.Data;

@Data
public class AdvertiseScreen extends AccountScreen{

    AdvertiseType advertiseType;

    String payModel ;

    /**
     * 广告状态 (012  上架/下架/关闭)
     */
    AdvertiseControlStatus status ;

}
