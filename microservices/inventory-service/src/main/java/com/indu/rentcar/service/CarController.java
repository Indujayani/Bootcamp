package com.indu.rentcar.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.indu.rentcar.model.Car;
import com.indu.rentcar.repository.CarRepository;



@RestController
public class CarController {
@Autowired
	CarService carService;

@RequestMapping(value="/car",method=RequestMethod.POST)
public void save(@RequestBody Car car)
{
		carService.save(car);
}

@RequestMapping(value="/car",method=RequestMethod.GET)
public List<Car> findByMake(@RequestParam("make") String make)
{
		return carService.findByMake(make);
}
}
