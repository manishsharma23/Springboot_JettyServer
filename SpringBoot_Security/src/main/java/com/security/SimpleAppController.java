package com.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  
class SimpleAppController {
	@GetMapping("hello")
	public ModelAndView welcome() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");
		return mav;
	}

	@GetMapping("error")
	public ModelAndView error() {
		ModelAndView mav = new ModelAndView();
		return mav;
	}
} 