package com.stackroute;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
    User str;
	@Responsebody
	@RequestMapping("/index")
	public ModelAndView getName(HttpServletRequest request){
		
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("result",str));
		return mv;
	}
}
