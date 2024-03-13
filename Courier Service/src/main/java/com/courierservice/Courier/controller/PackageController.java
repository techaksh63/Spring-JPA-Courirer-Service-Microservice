package com.courierservice.Courier.controller;

import com.courierservice.Courier.entity.PackageEntity;
import com.courierservice.Courier.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/packages")
public class PackageController {

    private final PackageService packageService;

    @Autowired
    public PackageController(@RequestBody PackageService packageService) {
        this.packageService = packageService;
    }

    @GetMapping
    public ResponseEntity<List<PackageEntity>> getAllPackages() {
        List<PackageEntity> packages = packageService.getAllPackages();
        return ResponseEntity.ok(packages);
    }

    @GetMapping("/{packageId}")
    public ResponseEntity<PackageEntity> getPackageById(@PathVariable Long packageId) {
        return packageService.getPackageById(packageId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PackageEntity> createPackage(@RequestBody PackageEntity packageEntity) {
        PackageEntity createdPackage = packageService.savePackage(packageEntity);
        return ResponseEntity.ok(createdPackage);
    }

    @DeleteMapping("/{packageId}")
    public ResponseEntity<Void> deletePackage(@PathVariable Long packageId) {
        packageService.deletePackage(packageId);
        return ResponseEntity.noContent().build();
    }
}
