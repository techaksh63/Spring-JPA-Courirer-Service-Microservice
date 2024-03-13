package com.courierservice.Courier.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "TokenEntity")
public class TokenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;

    @ManyToOne
    @JoinColumn(name = "user_id")
//    @JsonBackReference
    private UserEntity user;
    private String token;
    private Date expirationDateTime;
}
