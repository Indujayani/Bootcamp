package com.indu.app.eventmanager.model;

import javax.validation.constraints.Size;

public class Event {
	
	
	
	
	@Size(min=5,max=20,message="Event Name must be between 5 and 20")
	private String eventName;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	

}
