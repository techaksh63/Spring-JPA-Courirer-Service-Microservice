package com.courierservice.Courier.repository;

import com.courierservice.Courier.entity.Shipments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentsRepository extends JpaRepository<Shipments, Integer> {
}
