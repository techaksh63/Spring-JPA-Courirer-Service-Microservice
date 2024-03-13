package com.courierservice.Courier.repository;

import com.courierservice.Courier.entity.AuthorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<AuthorityEntity, Long> {
}
