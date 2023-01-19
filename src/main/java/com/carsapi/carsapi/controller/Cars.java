package com.carsapi.carsapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.carsapi.dto.CarDTO;
import com.carsapi.carsapi.model.Car;
import com.carsapi.carsapi.repository.CarRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/car")
public class Cars {

    @Autowired
    private CarRepository repository;

    @PostMapping
    public void createCar( @RequestBody @Valid CarDTO req){
        repository.save(new Car(req));
    }

    @GetMapping
    public List<Car> listAll(){
        return repository.findAll();
    }
}
