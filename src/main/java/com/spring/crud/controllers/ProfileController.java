package com.spring.crud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.spring.crud.models.Profile;

@Controller
public class ProfileController {

	@RequestMapping("profile")
	public ModelAndView Profile(Profile profile)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("profile", profile);
		mv.setViewName("Profile");
		return mv;
	}
}
