package com.krishantha.eventManager.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.krishantha.eventManager.model.Event;

@Repository(value="eventRepository")
public class EventRepositoryImpl implements EventRepository{

	
	@PersistenceContext
	EntityManager entityManager;
	public Event save(Event event){
		entityManager.persist(event);
		entityManager.flush();
		return null;
	}
	public List<Event> fetchAllEvents() {
		Query query =entityManager.createQuery("SELECT e FROM Event e");
		List<Event> events=query.getResultList();
		for(Event event:events){
			
			System.out.println(event.getEventName());
		}
		return events;
	}

	
	
}
