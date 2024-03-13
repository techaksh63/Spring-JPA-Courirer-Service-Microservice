package com.courierservice.Courier.repository;

import com.courierservice.Courier.entity.TokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<TokenEntity, Long> {
}
