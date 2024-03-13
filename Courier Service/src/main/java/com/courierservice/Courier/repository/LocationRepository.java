package com.courierservice.Courier.repository;

import com.courierservice.Courier.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<LocationEntity, Long> {
}
