package com.courierservice.Courier.repository;

import com.courierservice.Courier.entity.CourierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourierRepository extends JpaRepository<CourierEntity, Long> {
}
