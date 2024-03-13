package com.courierservice.Courier.repository;

import com.courierservice.Courier.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
