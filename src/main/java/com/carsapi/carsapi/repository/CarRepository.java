package com.carsapi.carsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carsapi.carsapi.model.Car;

public interface CarRepository extends JpaRepository<Car,Long> {
    
}
