package com.courierservice.Courier.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "ShipmentsStatus")
public class ShipmentsStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shipmentsStatus_Id;
    private String Status;
}
