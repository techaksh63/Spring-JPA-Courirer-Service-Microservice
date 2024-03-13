package com.courierservice.Courier.repository;

import com.courierservice.Courier.entity.PackageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<PackageEntity, Long> {
}
