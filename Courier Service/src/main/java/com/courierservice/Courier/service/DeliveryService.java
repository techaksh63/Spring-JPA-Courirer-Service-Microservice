package com.courierservice.Courier.service;

import com.courierservice.Courier.entity.DeliveryEntity;
import com.courierservice.Courier.repository.DeliveryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;

    @Autowired
    public DeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    public List<DeliveryEntity> getAllDeliveries() {
        return deliveryRepository.findAll();
    }

    public Optional<DeliveryEntity> getDeliveryById(Long deliveryId) {
        return deliveryRepository.findById(deliveryId);
    }

    public DeliveryEntity saveDelivery(DeliveryEntity deliveryEntity) {
        return deliveryRepository.save(deliveryEntity);
    }

    public void deleteDelivery(Long deliveryId) {
        deliveryRepository.deleteById(deliveryId);
    }

}
