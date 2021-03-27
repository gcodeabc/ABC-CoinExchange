package com.ABC.bitrade.model.screen;

import com.ABC.bitrade.constant.BooleanEnum;
import com.ABC.bitrade.constant.CommonStatus;

import lombok.Data;

@Data
public class TransferAddressScreen {
    private CommonStatus start ;
    private String address;
    private String unit;
}
