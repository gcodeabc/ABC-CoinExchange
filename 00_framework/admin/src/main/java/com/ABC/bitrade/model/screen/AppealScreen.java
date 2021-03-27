package com.ABC.bitrade.model.screen;

import com.ABC.bitrade.constant.*;
import com.ABC.bitrade.entity.Advertise;

import lombok.Data;

@Data
public class AppealScreen {
    private AdvertiseType advertiseType ;
    private String complainant ;//申诉者
    private String negotiant;//交易者
    private BooleanEnum success;
    private String unit ;
    private OrderStatus status ;
    private Boolean auditing = false ;
}
