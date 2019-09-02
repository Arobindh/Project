package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
	@RequestMapping("home")
	public ModelAndView home(User U)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj", U);
		mv.setViewName("Home");
		return mv; 
	}
}
