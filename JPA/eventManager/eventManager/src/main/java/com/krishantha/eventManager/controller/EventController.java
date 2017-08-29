package com.krishantha.eventManager.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.krishantha.eventManager.model.Event;

@Controller
@SessionAttributes("event")
public class EventController {

	@RequestMapping(value = "/addEvent", method = RequestMethod.GET)
	public String getEvent(Model model) {
		Event event = new Event();
		event.setEventName("Wedding");
		model.addAttribute("event", event);
		return "addEvent";

	}

	@RequestMapping(value = "/addEvent", method = RequestMethod.POST)
	public String updateEvent(@Valid @ModelAttribute("event") Event event, BindingResult results) {
		if (results.hasErrors()) {
			System.out.println("Error occured");
			return "addEvent";
		} else {
			System.out.println("Default event updated as : " + event.getEventName());
			return "redirect:addActivity.html";
		}
	}

}
