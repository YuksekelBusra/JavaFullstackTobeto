package com.tobeto.spring.b.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "driver's_license")
public class DriversLicense {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="license_number")
    private int licenseNumber;

    @Column(name ="license_type")
    private String licenseType;

    @Column(name ="expiration_date")
    private String expirationDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private  Customer customer;
}
