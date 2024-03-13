package com.courierservice.Courier.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "UserEntity")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String firstName;
    private String lastName;
    private String email;

    private String username;
    private String hashedPassword;

    private String phoneNumber;
    private String address;

    @OneToMany(mappedBy = "sender")
    private List<PackageEntity> sentPackages;

    @OneToMany(mappedBy = "receiver")
    private List<PackageEntity> receivedPackages;
//
    @OneToMany(mappedBy = "deliveryPerson")
//    @JsonManagedReference
    private List<DeliveryEntity> deliveries;

    @ManyToMany
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<RoleEntity> roles;

    @OneToOne(mappedBy = "user")
    private TokenEntity token;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

}

