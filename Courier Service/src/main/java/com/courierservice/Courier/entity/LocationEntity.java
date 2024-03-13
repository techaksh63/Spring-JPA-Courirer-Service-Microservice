package com.courierservice.Courier.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "LocationEntity")
public class LocationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;

    @ManyToOne
    @JoinColumn(name = "package_id")
//    @JsonBackReference
    private PackageEntity packages;

    private double latitude;
    private double longitude;
    private Date timestamp;

}
