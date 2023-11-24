package com.tobeto.spring.b.entities;


import jakarta.persistence.*;

@Table(name = "rental")
@Entity
public class Rental {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "pickup_date_and_time")
    private String pickupDateAndTime;

    @Column(name = "return_date_and_time")
    private String ReturnDateAndTime;

    @Column(name="daily_route(km)")
    private int dailyRoute;

    @Column(name="total_cost")
    private int totalCost;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private  Customer customer;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private  Car car;


}
