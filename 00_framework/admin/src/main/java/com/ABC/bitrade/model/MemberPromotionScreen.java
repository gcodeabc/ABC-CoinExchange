package com.ABC.bitrade.model;

import com.ABC.bitrade.model.screen.AccountScreen;

import lombok.Data;

@Data
public class MemberPromotionScreen extends AccountScreen{

    private int minPromotionNum = -1;

    private int maxPromotionNum = -1;
}
