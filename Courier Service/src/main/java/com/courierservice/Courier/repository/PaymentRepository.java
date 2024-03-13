package com.courierservice.Courier.repository;

import com.courierservice.Courier.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity,Long>  {
}
