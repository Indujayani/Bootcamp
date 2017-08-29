package com.indu.rentcar.service;

import java.util.List;

import javax.xml.ws.ServiceMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indu.rentcar.model.Car;
import com.indu.rentcar.repository.CarRepository;



@Service
public class CarServiceImpl implements CarService {
	
	
 @Autowired
 CarRepository carRepository;
 public Car save(Car car){
	 
	 return carRepository.save(car);
	 
 }
 public List<Car> findByMake(String make){
	 return carRepository.findByMake(make);
	 
 }
}
