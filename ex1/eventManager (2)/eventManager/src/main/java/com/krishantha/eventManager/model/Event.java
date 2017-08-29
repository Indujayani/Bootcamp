package com.krishantha.eventManager.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Generated;

@Entity
@Table(name = "event")
public class Event {

	@Id // id
	@GeneratedValue // auto Generated
	@Column(name="eventId")
	
	private Long id;

	@Size(min = 5, max = 100, message = "Event name should between 5 and 10 characters")
	private String eventName;

	String eventType;

	@OneToMany(mappedBy = "event", cascade = { javax.persistence.CascadeType.ALL },fetch=FetchType.EAGER)
	List<Activity> activities = new ArrayList<Activity>();

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}


	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}



}
