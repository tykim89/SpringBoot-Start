package com.ty.springboot;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value="/")
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index");
		ArrayList<String[]> data = new ArrayList<String[]>();
		data.add(new String[]{"park", "park@yamada", "090-999-999"});
		data.add(new String[]{"lee", "lee@flower", "010-111-1111"});
		data.add(new String[]{"choi", "choi@sony", "055-555-555"});
		mav.addObject("data", data);
		return mav;
	}

	
}