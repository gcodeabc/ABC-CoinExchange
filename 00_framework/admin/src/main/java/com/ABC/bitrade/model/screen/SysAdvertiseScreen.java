package com.ABC.bitrade.model.screen;

import com.ABC.bitrade.constant.CommonStatus;
import com.ABC.bitrade.constant.SysAdvertiseLocation;

import lombok.Data;

@Data
public class SysAdvertiseScreen {
    private String serialNumber;
    private SysAdvertiseLocation sysAdvertiseLocation;
    private CommonStatus status;
}
