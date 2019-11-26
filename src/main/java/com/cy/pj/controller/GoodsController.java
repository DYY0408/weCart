package com.cy.pj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //此类交给spring管理
public class GoodsController {

	@ResponseBody //返回json串
	@RequestMapping("doHello") //映射路径
	public String testHellow() {
		return "Hello Spring Goods";
	}
	
	//返回网页
	@RequestMapping("doGoods")
	public String testHtml() {
		return "goods";
	}
}
