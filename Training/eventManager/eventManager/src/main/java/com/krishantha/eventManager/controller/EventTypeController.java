package com.krishantha.eventManager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishantha.eventManager.model.EventType;
@RestController
public class EventTypeController {
	
	@RequestMapping(value="getEventTypes")
	public List<EventType> geEventTypes(){
		List<EventType>eventTypes = new ArrayList<EventType>();
		
		EventType eventType= new EventType();
		eventType.setEventType("wedding");
		eventTypes.add(eventType);
		
		eventType= new EventType();
		eventType.setEventType("Birthday");
		eventTypes.add(eventType);
		
		eventType= new EventType();
		eventType.setEventType("Good bye");
		eventTypes.add(eventType);
		
		eventType= new EventType();
		eventType.setEventType("First Salary");
		eventTypes.add(eventType);
		
		eventType= new EventType();
		eventType.setEventType("Anniversorry");
		eventTypes.add(eventType);
		
		return eventTypes;
	}

}
