package com.courierservice.Courier.controller;

import com.courierservice.Courier.entity.DeliveryEntity;
import com.courierservice.Courier.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deliveries")
public class DeliveryController {

    private final DeliveryService deliveryService;

    @Autowired
    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping
    public ResponseEntity<List<DeliveryEntity>> getAllDeliveries() {
        List<DeliveryEntity> deliveries = deliveryService.getAllDeliveries();
        return ResponseEntity.ok(deliveries);
    }

    @GetMapping("/{deliveryId}")
    public ResponseEntity<DeliveryEntity> getDeliveryById(@PathVariable Long deliveryId) {
        return deliveryService.getDeliveryById(deliveryId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DeliveryEntity> createDelivery(@RequestBody DeliveryEntity deliveryEntity) {
        DeliveryEntity createdDelivery = deliveryService.saveDelivery(deliveryEntity);
        return ResponseEntity.ok(createdDelivery);
    }

    @DeleteMapping("/{deliveryId}")
    public ResponseEntity<Void> deleteDelivery(@PathVariable Long deliveryId) {
        deliveryService.deleteDelivery(deliveryId);
        return ResponseEntity.noContent().build();
    }

}