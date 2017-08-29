package com.indu.rentcar.service;

import java.util.List;

import com.indu.rentcar.model.Car;

public interface CarService {
	Car save(Car car);

	List<Car> findByMake(String make);
}
