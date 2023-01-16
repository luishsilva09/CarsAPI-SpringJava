package com.carsapi.carsapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.dto.CarDTO;

@RestController
@RequestMapping("/create/car")
public class Cars {
    @PostMapping
    public void createCar( @RequestBody CarDTO req){
        System.out.println(req);
        System.out.println(req.anoModelo());
        System.out.println(req.fabricante());
    }
}
