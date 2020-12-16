package org.zerock.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.zerock.domain.MemberVO;

@Controller
public class TestController {
	@Inject
    private MemberVO dao;
    
    @RequestMapping(value = "/testDAO", method = RequestMethod.GET)
    public void testDAO(){
        MemberVO vo = new MemberVO();
        vo.setUserid("MIN-IT");
        vo.setPasswd("1234");
        vo.setUsernum((long) 2);
        
      //  dao.insertMember(vo);
    }


}
