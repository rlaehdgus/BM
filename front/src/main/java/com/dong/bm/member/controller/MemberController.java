package com.dong.bm.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dong.bm.main.controller.MainController;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping("/sign_up.do")
	public String sign_up() {
		
		return "/member/sign_up";
	}
}
