package com.indu.app.eventmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.indu.app.eventmanager.model.Activity;

@Controller
public class ActivityController {

	@RequestMapping(value="/greeting")
	public String getWelcomMessage(Model model){
		model.addAttribute("message","Hi...Mvc..you handy");
		return "welcome";
	}
	
	@RequestMapping(value="/addActivity")
	public String addActivity(@ModelAttribute("activities") Activity activity){
		
		if(activity.getActivityName()==null){
			return "addActivity";
		}else{
		System.out.println(activity.getActivityName());
			return "redirect:addSubActivity.html";
		}
	}
	@RequestMapping(value="/addSubActivity")
	public String addSubActivity(@ModelAttribute("activities") Activity activity){
		System.out.println("Sub Activity is :"+activity.getActivityName());
		return "addActivity";
	}
}
