package com.courierservice.Courier.service;
import com.courierservice.Courier.entity.LocationEntity;
import com.courierservice.Courier.repository.LocationRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LocationService {

    private final LocationRepository locationRepository;

    @Autowired
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<LocationEntity> getAllLocations() {
        return locationRepository.findAll();
    }

    public Optional<LocationEntity> getLocationById(Long locationId) {
        return locationRepository.findById(locationId);
    }

    public LocationEntity saveLocation(LocationEntity locationEntity) {
        return locationRepository.save(locationEntity);
    }

    public void deleteLocation(Long locationId) {
        locationRepository.deleteById(locationId);
    }

}
