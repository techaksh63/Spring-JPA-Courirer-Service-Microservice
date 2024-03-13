package com.courierservice.Courier.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "DeliveryEntity")
public class DeliveryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deliveryId;

    @ManyToOne
    @JoinColumn(name = "package_id")
//    @JsonBackReference
    private PackageEntity packages;

    @ManyToOne
    @JoinColumn(name = "courier_id")
//    @JsonBackReference
    private CourierEntity courier;

    private String status;
    private Date estimatedDeliveryTime;
    private Date actualDeliveryTime;

    @ManyToOne
    @JoinColumn(name = "delivery_person_id")
//    @JsonBackReference
    private UserEntity deliveryPerson;

}
