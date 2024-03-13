package com.courierservice.Courier.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "AuthorityEntity")
public class AuthorityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorityId;
    private String name; // e.g., ROLE_USER, ROLE_ADMIN
//    @ManyToMany(mappedBy = "users")
//    private List<RoleEntity> roles;

}
