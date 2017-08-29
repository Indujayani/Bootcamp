package com.indu.rentcar.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.indu.rentcar.model.Car;


public interface CarRepository extends Repository<Car,Integer>{
 Car save(Car car);
 List<Car> findByMake(String make);
}
