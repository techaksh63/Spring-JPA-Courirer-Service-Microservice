package com.courierservice.Courier.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Customer")
public class Customer {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int customer_Id;
   private String name;
   private String address;
   private String email;
   @ManyToMany(cascade = CascadeType.ALL)
   @JoinTable(name = "customer_Item",joinColumns = @JoinColumn(name = "customer_Id"), inverseJoinColumns = @JoinColumn(name = "item_ID"))
//   @JsonBackReference
   private Set<Item> item;

    public Customer(int customer_Id, String name, String address, String email) {
        this.customer_Id = customer_Id;
        this.name = name;
        this.address = address;
        this.email = email;
    }
}
