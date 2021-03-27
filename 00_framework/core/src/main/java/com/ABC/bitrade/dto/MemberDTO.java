package com.ABC.bitrade.dto;

import lombok.Data;

import java.util.List;

import com.ABC.bitrade.entity.Member;
import com.ABC.bitrade.entity.MemberWallet;

@Data
public class MemberDTO {

    private Member member ;

    private List<MemberWallet> list ;

}
