package com.dong.bm.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/common/error")
public class CommonErrorController {
	private static final Logger logger = LoggerFactory.getLogger(CommonErrorController.class);
	
	@RequestMapping("/throwable")
	public String throwable(HttpServletRequest request, Model model) {
		logger.info("throwable");
		pageErrorLog(request);
		model.addAttribute("msg", "예외가 발생하였습니다.");
		return "/error";
	}
	
	@RequestMapping("/exception")
	public String exception(HttpServletRequest request, Model model) {
		logger.info("exception");
		pageErrorLog(request);
		model.addAttribute("msg", "예외가 발생하였습니다.");
		return "/error";
	}
	
	@RequestMapping("/400")
	public String pageError400(HttpServletRequest request, Model model) {
		logger.info("page error code 400");
		pageErrorLog(request);
		model.addAttribute("msg", "잘못된 요청입니다.");
		return "/error";
	}
	
	@RequestMapping("/403")
	public String pageError403(HttpServletRequest request, Model model) {
		logger.info("page error code 403");
		pageErrorLog(request);
		model.addAttribute("msg", "접근이 금지되었습니다.");
		return "/error";
	}
	
	@RequestMapping("/404")
	public String pageError404(HttpServletRequest request, Model model) {
		logger.info("page error code 404");
		pageErrorLog(request);
		model.addAttribute("msg", "요청하신 페이지는 존재하지 않습니다.");
		return "/error";
	}
	
	@RequestMapping("/405")
	public String pageError405(HttpServletRequest request, Model model) {
		logger.info("page error code 405");
		pageErrorLog(request);
		model.addAttribute("msg", "요청된 메소드가 허용되지 않습니다.");
		return "/error";
	}
	
	@RequestMapping("/500")
	public String pageError500(HttpServletRequest request, Model model) {
		logger.info("page error code 500");
		pageErrorLog(request);
		model.addAttribute("msg", "서버에 오류가 발생하였습니다.");
		return "/error";
	}
	
	@RequestMapping("/503")
	public String pageError503(HttpServletRequest request, Model model) {
		logger.info("page error code 503");
		pageErrorLog(request);
		model.addAttribute("msg", "서비스를 사용할 수 없습니다.");
		return "/error";
	}
	
	private void pageErrorLog(HttpServletRequest request) {
		logger.info("status_code: " + request.getAttribute("javax.servlet.error.status_code"));
		logger.info("exceprion_type: " + request.getAttribute("javax.servlet.error.exceprion_type"));
		logger.info("message: " + request.getAttribute("javax.servlet.error.message"));
		logger.info("request_url: " + request.getAttribute("javax.servlet.error.request_url"));
		logger.info("exception: " + request.getAttribute("javax.servlet.error.exception"));
		logger.info("servlet_name: " + request.getAttribute("javax.servlet.error.servlet_name"));
	}
}