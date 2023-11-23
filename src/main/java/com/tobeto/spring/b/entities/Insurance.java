package com.tobeto.spring.b.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "insurance")
public class Insurance {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="insurance_provider")
    private String insuranceProvider;

    @Column(name ="policy_number")
    private int policeNumber;

    @Column(name ="coverage_details")
    private String coverageDetails;

    @Column(name ="expiration_date")
    private String expirationDate;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private  Car car;

}
