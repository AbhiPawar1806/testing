package com.crudapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class T_POOL_CAR_HIST {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int carHisId;
	private int carInt;
	private String carColour;
	private int carLoad;
	public int getCarHisId() {
		return carHisId;
	}
	public void setCarHisId(int carHisId) {
		this.carHisId = carHisId;
	}
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
	public T_POOL_CAR_HIST() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T_POOL_CAR_HIST(int carHisId, int carInt, String carColour, int carLoad) {
		super();
		this.carHisId = carHisId;
		this.carInt = carInt;
		this.carColour = carColour;
		this.carLoad = carLoad;
	}
	
	
}
