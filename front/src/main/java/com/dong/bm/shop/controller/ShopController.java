package com.dong.bm.shop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {
	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
	
	@RequestMapping("/shop_bookList.do")
	public String shop_bookList() {
		logger.info("Start shop_bookList page!");
		
		return "/shop/shop_bookList";
	}
}
