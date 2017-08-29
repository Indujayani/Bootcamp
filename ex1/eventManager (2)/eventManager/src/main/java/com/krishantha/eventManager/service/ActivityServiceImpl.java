package com.krishantha.eventManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.krishantha.eventManager.model.Activity;
import com.krishantha.eventManager.model.Event;
import com.krishantha.eventManager.repository.ActivityRepository;
import com.krishantha.eventManager.repository.EventRepository;


@Service(value = "activityService")
public class ActivityServiceImpl implements ActivityService {
	@Autowired
	ActivityRepository repository;
	
	@Transactional
	public Activity save(Activity activity) {
		repository.save(activity);
		return null;
	}

}
