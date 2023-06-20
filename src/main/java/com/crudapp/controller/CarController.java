package com.crudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudapp.entities.T_POOL_CAR;
import com.crudapp.service.CarServices;

@RestController
public class CarController {

	@Autowired
	private CarServices carServices;
	
	//Adding the car
	@PostMapping("/car")
	public void saveCar(@RequestBody T_POOL_CAR car ) {
		this.carServices.saveCar(car);
	}
	
	@GetMapping("/cars")
	public List<T_POOL_CAR> getAllCars() {
		return this.carServices.getAllCar();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteByid(@PathVariable("id")int carInt ) {
		this.carServices.deleteById(carInt);
	}
	
}
