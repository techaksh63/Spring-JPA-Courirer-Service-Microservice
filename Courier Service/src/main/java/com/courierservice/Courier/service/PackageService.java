package com.courierservice.Courier.service;

import com.courierservice.Courier.entity.PackageEntity;
import com.courierservice.Courier.repository.PackageRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PackageService {

    private final PackageRepository packageRepository;

    @Autowired
    public PackageService(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    public List<PackageEntity> getAllPackages() {
        return packageRepository.findAll();
    }

    public Optional<PackageEntity> getPackageById(Long packageId) {
        return packageRepository.findById(packageId);
    }

    public PackageEntity savePackage(PackageEntity packageEntity) {
        return packageRepository.save(packageEntity);
    }

    public void deletePackage(Long packageId) {
        packageRepository.deleteById(packageId);
    }

}

