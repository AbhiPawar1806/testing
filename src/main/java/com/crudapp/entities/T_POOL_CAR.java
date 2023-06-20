package com.crudapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class T_POOL_CAR {

	
	
	@Id
	private int carInt;
	private String carColour;
	private int carLoad;
	public int getCarInt() {
		return carInt;
	}
	public void setCarInt(int carInt) {
		this.carInt = carInt;
	}
	public String getCarColour() {
		return carColour;
	}
	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}
	public int getCarLoad() {
		return carLoad;
	}
	public void setCarLoad(int carLoad) {
		this.carLoad = carLoad;
	}
	public T_POOL_CAR() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T_POOL_CAR(int carInt, String carColour, int carLoad) {
		super();
		this.carInt = carInt;
		this.carColour = carColour;
		this.carLoad = carLoad;
	}
}
