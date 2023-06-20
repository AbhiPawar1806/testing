package com.crudapp.service;

import java.util.List;

import com.crudapp.entities.T_POOL_CAR;


public interface CarServices {

	public void saveCar(T_POOL_CAR car);
	
	public List<T_POOL_CAR> getAllCar();

	public void deleteById(int carInt);
}
