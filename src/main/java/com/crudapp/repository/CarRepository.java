package com.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudapp.entities.T_POOL_CAR;

@Repository
public interface CarRepository  extends JpaRepository<T_POOL_CAR,Integer>{

}
