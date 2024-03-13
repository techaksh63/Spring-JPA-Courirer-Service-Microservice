package com.courierservice.Courier.controller;
import com.courierservice.Courier.entity.CourierEntity;
import com.courierservice.Courier.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/couriers")
public class CourierController {

    private final CourierService courierService;

    @Autowired
    public CourierController(CourierService courierService) {
        this.courierService = courierService;
    }

    @GetMapping
    public ResponseEntity<List<CourierEntity>> getAllCouriers() {
        List<CourierEntity> couriers = courierService.getAllCouriers();
        return ResponseEntity.ok(couriers);
    }

    @GetMapping("/{courierId}")
    public ResponseEntity<CourierEntity> getCourierById(@PathVariable Long courierId) {
        return courierService.getCourierById(courierId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CourierEntity> createCourier(@RequestBody CourierEntity courier) {
        CourierEntity createdCourier = courierService.saveCourier(courier);
        return ResponseEntity.ok(createdCourier);
    }

    @DeleteMapping("/{courierId}")
    public ResponseEntity<Void> deleteCourier(@PathVariable Long courierId) {
        courierService.deleteCourier(courierId);
        return ResponseEntity.noContent().build();
    }

}
