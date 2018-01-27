package com.luv2code.com.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/","/Home","/Index"})
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("msg", "hello");
		return mv;
	}
	
	@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam("greeting")String msg )  {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("msg", "gregreetingeting");
		return mv;
	}

}
