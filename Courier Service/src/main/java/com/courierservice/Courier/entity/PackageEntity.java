package com.courierservice.Courier.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "PackageEntity")
public class PackageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packageId;

    @ManyToOne
    @JoinColumn(name = "sender_id")
//    @JsonBackReference
    private UserEntity sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
//    @JsonBackReference
    private UserEntity receiver;

    @ManyToOne
    @JoinColumn(name = "courier_id")
//    @JsonBackReference
    private CourierEntity courier;

    private double weight;
    private String dimensions;
    private String status;
    private String pickupAddress;
    private String deliveryAddress;
    private Date pickupDateTime;
    private Date deliveryDateTime;


    @OneToMany(mappedBy = "packages")
//    @JsonManagedReference
    private List<DeliveryEntity> deliveries;

    @OneToOne(mappedBy = "packages")
//    @JsonBackReference
    private PaymentEntity payment;

    @OneToMany(mappedBy = "packages")
//    @JsonManagedReference
    private List<LocationEntity> locations;

}
