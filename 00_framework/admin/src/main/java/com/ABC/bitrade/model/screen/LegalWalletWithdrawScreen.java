package com.ABC.bitrade.model.screen;

import com.ABC.bitrade.constant.WithdrawStatus;

import lombok.Data;

@Data
public class LegalWalletWithdrawScreen {
    WithdrawStatus status;
    String username;
    String coinName;

}
