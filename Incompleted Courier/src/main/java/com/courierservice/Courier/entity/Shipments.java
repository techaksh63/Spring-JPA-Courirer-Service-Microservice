package com.courierservice.Courier.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Shipments")
public class Shipments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shipment_Id;
    private Date StartDate;
    private String FromAddress;
    private String ToAddress;
    private String Status;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "StatusID")
    private ShipmentsStatus shipmentsStatus;
}
