package com.ABC.bitrade.vo;

import com.ABC.bitrade.entity.MemberTransaction;

import lombok.Data;

@Data
public class MemberTransactionVO extends MemberTransaction{

    private String memberUsername ;

    private String memberRealName ;

    private String phone ;

    private String email ;
    
}
