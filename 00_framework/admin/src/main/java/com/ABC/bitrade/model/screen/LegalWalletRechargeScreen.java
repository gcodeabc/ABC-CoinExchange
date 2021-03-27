package com.ABC.bitrade.model.screen;

import com.ABC.bitrade.constant.LegalWalletState;

import lombok.Data;

@Data
public class LegalWalletRechargeScreen {
    LegalWalletState status;
    String username;
    String coinName;

}
