package com.indu.app.eventmanager.controller;

import java.util.concurrent.SynchronousQueue;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.indu.app.eventmanager.model.Event;

@Controller
@SessionAttributes("event")
public class EventController {

	@RequestMapping(value = "/Event", method = RequestMethod.GET)
	public String getEvent(Model model) {

		Event event = new Event();
		event.setEventName("Wedding");
		model.addAttribute("event", event);
		return "addEvent";
	}

	@RequestMapping(value = "/Event", method = RequestMethod.POST)
	public String updateEvent(@Valid @ModelAttribute("event") Event event, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Payload has errors");
			return "addEvent";
		} else {
			System.out.println("event updated as" + event.getEventName());
			return "redirect:addActivity.html";
		}
	}
}
