package com.courierservice.Courier.controller;

import com.courierservice.Courier.entity.LocationEntity;
import com.courierservice.Courier.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    private final LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public ResponseEntity<List<LocationEntity>> getAllLocations() {
        List<LocationEntity> locations = locationService.getAllLocations();
        return ResponseEntity.ok(locations);
    }

    @GetMapping("/{locationId}")
    public ResponseEntity<LocationEntity> getLocationById(@PathVariable Long locationId) {
        return locationService.getLocationById(locationId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<LocationEntity> createLocation(@RequestBody LocationEntity locationEntity) {
        LocationEntity createdLocation = locationService.saveLocation(locationEntity);
        return ResponseEntity.ok(createdLocation);
    }

    @DeleteMapping("/{locationId}")
    public ResponseEntity<Void> deleteLocation(@PathVariable Long locationId) {
        locationService.deleteLocation(locationId);
        return ResponseEntity.noContent().build();
    }

}
