package org.axiomaticit.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView index() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
}