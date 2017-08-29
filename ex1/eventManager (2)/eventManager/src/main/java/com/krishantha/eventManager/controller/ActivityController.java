package com.krishantha.eventManager.controller;

import java.security.Provider.Service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.krishantha.eventManager.model.Activity;
import com.krishantha.eventManager.model.Event;
import com.krishantha.eventManager.service.ActivityService;

@Controller
public class ActivityController {
@Autowired
	ActivityService service;

	@RequestMapping(value = "/greeting")
	public String getGreeting(Model model) {
		model.addAttribute("msg", "Wow spring you are awesome");
		return "welcome";
	}
	
	
	@RequestMapping(value = "/addActivity",method=RequestMethod.GET)
	
	public String getActivity(Model model, HttpSession session) {
		Event event = (Event) session.getAttribute("event");
		if (event == null) {
			System.out.println("Cannot find valid event.redirecting....");
			return "redirect:addEvent.html";
		} else {
			Activity activity = new Activity();
			activity.setActivityName("sampleActivityName");
			model.addAttribute("activities", activity);
		}
		return "addActivity";
	}

	@RequestMapping(value = "/addActivity",method=RequestMethod.POST)
	public String addActivity(@ModelAttribute("activities") Activity activity, HttpSession session) {
		System.out.println("Activity is " + activity.getActivityName());
		Event event = (Event) session.getAttribute("event");
		if (event == null) {
			System.out.println("Cannot find valid event.redirecting....");
			return "redirect:addEvent.html";
		} else {
			activity.setEvent(event);
			service.save(activity);		}
		return "redirect:index.jsp";
	}

	@RequestMapping(value = "/addSubActivity")
	public String addSubActivity(@ModelAttribute("activities") Activity activity) {
		System.out.println("Sub Activity is " + activity.getActivityName());
		return "addActivity";
	}

}
