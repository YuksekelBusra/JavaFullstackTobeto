package com.tobeto.spring.b.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "cars")
@Entity
public class Car
{
    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "licence_plate")
    private int licencePlate ;

    @Column(name ="make")
    private String make;

    @Column(name = "model")
    private String model;

    @Column(name="year")
    private int year;

    @Column(name="color")
    private String color;

    @Column(name = "rental_rate_per_day")
    private int rental_rate_per_day;

    @OneToMany(mappedBy = "car")
    private List<Rental> rentals;

    @OneToMany(mappedBy = "car")
    private List<Insurance> insurances;

    public Car() {
    }
}
