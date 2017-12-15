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
		mav.addObject("msg", "current data.");
		DataObject obj = new DataObject(123, "tykim", "ty_1109.kim@samsung.com");
		mav.addObject("object", obj);
		return mav;
	}

	
	class DataObject {
	    private int id;
	    private String name;
	    private String value;
	    
	    public DataObject(int id, String name, String value){
	        this.id = id;
	        this.name = name;
	        this.value = value;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getValue() {
	        return value;
	    }

	    public void setValue(String value) {
	        this.value = value;
	    }
	}

}