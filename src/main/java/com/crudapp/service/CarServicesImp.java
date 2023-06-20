package com.crudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapp.entities.T_POOL_CAR;
import com.crudapp.entities.T_POOL_CAR_HIST;
import com.crudapp.repository.CarDeleteRepository;
import com.crudapp.repository.CarRepository;

@Service
public class CarServicesImp  implements CarServices{

	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private CarDeleteRepository deleteRepository;
	@Override
	public void saveCar(T_POOL_CAR car) {
		// TODO Auto-generated method stub
		T_POOL_CAR save = this.carRepository.save(car);
		System.out.println("Car with id " + save.getCarInt()+" added succesfully");
	}
	@Override
	public List<T_POOL_CAR> getAllCar() {
		// TODO Auto-generated method stub
		return this.carRepository.findAll();
	}
	@Override
	public void deleteById(int carInt) {
		// TODO Auto-generated method stub
		  T_POOL_CAR car = carRepository.findById(carInt).orElse(null);
	        if (car != null) {
	            carRepository.delete(car);
	        }
	        
	        // NOw send this objec to delete pool
	        T_POOL_CAR_HIST deletedCar = new T_POOL_CAR_HIST();
	        deletedCar.setCarInt(car.getCarInt());
	        deletedCar.setCarColour(car.getCarColour());
	        deletedCar.setCarLoad(car.getCarLoad());
	        
	        this.deleteRepository.save(deletedCar);
	        System.out.println("Car with id" + car.getCarInt() + " deleted and has added in deleteCar Database ");
	        
	}

}
