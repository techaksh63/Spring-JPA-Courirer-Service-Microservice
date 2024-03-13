package com.courierservice.Courier.repository;

import com.courierservice.Courier.entity.DeliveryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<DeliveryEntity, Long> {
}
