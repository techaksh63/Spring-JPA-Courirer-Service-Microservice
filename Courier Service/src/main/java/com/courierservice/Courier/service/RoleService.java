package com.courierservice.Courier.service;
import com.courierservice.Courier.entity.RoleEntity;
import com.courierservice.Courier.repository.RoleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<RoleEntity> getAllRoles() {
        return roleRepository.findAll();
    }

    public Optional<RoleEntity> getRoleById(Long roleId) {
        return roleRepository.findById(roleId);
    }

    public RoleEntity saveRole(RoleEntity roleEntity) {
        return roleRepository.save(roleEntity);
    }

    public void deleteRole(Long roleId) {
        roleRepository.deleteById(roleId);
    }

}
