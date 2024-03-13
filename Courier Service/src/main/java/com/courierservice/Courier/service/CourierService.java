package com.courierservice.Courier.service;

import com.courierservice.Courier.entity.CourierEntity;
import com.courierservice.Courier.repository.CourierRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CourierService {

    private final CourierRepository courierRepository;

    @Autowired
    public CourierService(CourierRepository courierRepository) {
        this.courierRepository = courierRepository;
    }

    public List<CourierEntity> getAllCouriers() {
        return courierRepository.findAll();
    }

    public Optional<CourierEntity> getCourierById(Long courierId) {
        return courierRepository.findById(courierId);
    }

    public CourierEntity saveCourier(CourierEntity courier) {
        return courierRepository.save(courier);
    }

    public void deleteCourier(Long courierId) {
        courierRepository.deleteById(courierId);
    }

}
