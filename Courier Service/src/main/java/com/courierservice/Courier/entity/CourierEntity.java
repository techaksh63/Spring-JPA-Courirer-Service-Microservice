package com.courierservice.Courier.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "CourierEntity")
public class CourierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courierId;

    private String courierName;
    private String courierType;
    private int capacity;

    @OneToMany(mappedBy = "courier")
//    @JsonManagedReference
    private List<PackageEntity> packages;

    @OneToMany(mappedBy = "courier")
//    @JsonManagedReference
    private List<DeliveryEntity> deliveries;

}