package com.courierservice.Courier.service;
import com.courierservice.Courier.entity.PaymentEntity;
import com.courierservice.Courier.repository.PaymentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<PaymentEntity> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Optional<PaymentEntity> getPaymentById(Long paymentId) {
        return paymentRepository.findById(paymentId);
    }

    public PaymentEntity savePayment(PaymentEntity paymentEntity) {
        return paymentRepository.save(paymentEntity);
    }

    public void deletePayment(Long paymentId) {
        paymentRepository.deleteById(paymentId);
    }

}