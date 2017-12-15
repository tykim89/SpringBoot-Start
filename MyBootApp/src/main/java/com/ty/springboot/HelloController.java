package com.ty.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value="/")
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/other")
	public ModelAndView other(){
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/home")
	public String home(){
		return "forward:/";
	}
	
}