package com.ty.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value="/{id}")
	public ModelAndView index(@PathVariable int id, ModelAndView mav){
		mav.setViewName("index");
		mav.addObject("id", id);
		mav.addObject("check", id%2 == 0);
		mav.addObject("trueVal", "Even number!");
		mav.addObject("falseVal", "Odd number...");
		return mav;
	}

	
}