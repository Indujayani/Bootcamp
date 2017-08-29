package com.krishantha.eventManager.service;

import java.util.List;

import com.krishantha.eventManager.model.*;



public interface EventService {

	List<EventType> getAllEventTypes();
	Event save(Event event);
	List<Event> fetchAllEvents();

}