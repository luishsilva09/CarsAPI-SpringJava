package com.carsapi.carsapi.model;

import com.carsapi.carsapi.dto.CarDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {

    public Car(CarDTO data){
        this.modelo = data.modelo();
        this.fabricante = data.fabricante();
        this.anoModelo = data.anoModelo();
        this.dataFabricacao = data.dataFabricacao();
        this.valor = data.valor();

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 50, nullable = false)
    private String modelo;

    @Column(length = 50, nullable = false)
    private String fabricante;

    @Column(length = 50, nullable = false)
    private String dataFabricacao;

    @Column(length = 50, nullable = false)
    private double valor;

    @Column(length = 50, nullable = false)
    private int anoModelo;
}
