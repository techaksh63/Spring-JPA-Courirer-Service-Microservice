package com.courierservice.Courier.controller;

import com.courierservice.Courier.entity.RoleEntity;
import com.courierservice.Courier.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public ResponseEntity<List<RoleEntity>> getAllRoles() {
        List<RoleEntity> roles = roleService.getAllRoles();
        return ResponseEntity.ok(roles);
    }

    @GetMapping("/{roleId}")
    public ResponseEntity<RoleEntity> getRoleById(@PathVariable Long roleId) {
        return roleService.getRoleById(roleId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<RoleEntity> createRole(@RequestBody RoleEntity roleEntity) {
        RoleEntity createdRole = roleService.saveRole(roleEntity);
        return ResponseEntity.ok(createdRole);
    }

    @DeleteMapping("/{roleId}")
    public ResponseEntity<Void> deleteRole(@PathVariable Long roleId) {
        roleService.deleteRole(roleId);
        return ResponseEntity.noContent().build();
    }

}