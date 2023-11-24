package com.tobeto.spring.b.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name ="surname")
    private String surname;

    @Column(name ="phone_number")
    private int phoneNumber;

    @Column(name ="email")
    private String email;

    @Column(name ="address")
    private String address;

    @Column(name ="occupation")
    private String occupation;

    @OneToMany(mappedBy = "customer")   //attribute ismi
    private List<Rental> rentals;

    @OneToMany(mappedBy = "customer")   //attribute ismi
    private List<DriversLicense> driversLicenses;

}
