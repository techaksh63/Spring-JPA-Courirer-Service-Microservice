package com.Company.Microservices.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class MicroController {

    @GetMapping
    public ResponseEntity<List<?>> getUserDetail(){
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://localhost:8080/api/users";
           List<?> User = restTemplate.getForObject(resourceUrl, List.class);
        return ResponseEntity.ok(User);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserDetailsByID(@PathVariable Long userId) {
        RestTemplate restTemplate = new RestTemplate();
        String BASE_URL = "http://localhost:8080/api/users/";
        String resourceUrl = BASE_URL + userId;

        Object user = restTemplate.getForObject(resourceUrl, Object.class);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody Object user) {
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://localhost:8080/api/users";

        Object createdUser = restTemplate.postForObject(resourceUrl, user, Object.class);
        return ResponseEntity.ok(createdUser);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Long userId) {
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://localhost:8080/api/users/";

        restTemplate.delete(resourceUrl+userId, Object.class);
        return ResponseEntity.noContent().build();

    }
    @PutMapping("/{userId}")
    public ResponseEntity<?> updateUser(@PathVariable Long userId, @RequestBody Object updatedUser) {
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://localhost:8080/api/users/";

            restTemplate.put(resourceUrl, updatedUser);
            return ResponseEntity.noContent().build();

    }




}
