package com.ABC.bitrade.test.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ABC.bitrade.entity.Member;
import com.ABC.bitrade.service.MemberService;
import com.ABC.bitrade.test.BaseTest;


public class MemberServiceTest extends BaseTest {

	@Autowired
	private MemberService memberService;
	
	@Test
	public void test() {
        Member member=memberService.findOne(25L);
        System.out.println(">>>>>>>>>>>>>>"+member);
        
	}

}
