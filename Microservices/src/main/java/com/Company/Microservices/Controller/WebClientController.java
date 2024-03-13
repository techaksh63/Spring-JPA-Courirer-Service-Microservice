package com.Company.Microservices.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@RestController
@RequestMapping("/client/api/users")
public class WebClientController {
    @GetMapping
    public ResponseEntity<List<?>> getUserDetail(){
        WebClient.Builder builder = WebClient.builder();
        WebClient client = WebClient.create();
        String resourceUrl = "http://localhost:8080/api/users";

        List<?> User = builder.build().get().uri(resourceUrl).retrieve().bodyToMono(List.class).block();
        return ResponseEntity.ok(User);
    }
    @PostMapping
    public Object createUser(@RequestBody Object user) {
        WebClient.Builder builder = WebClient.builder();
        String resourceUrl = "http://localhost:8080/api/users";

          Object createdUser = builder.build().post().uri(resourceUrl).bodyValue(user).retrieve().toEntity(Object.class).block();
          return createdUser;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserDetailsByID(@PathVariable Long userId) {
        WebClient.Builder builder = WebClient.builder();
        String BASE_URL = "http://localhost:8080/api/users/";
        String resourceUrl = BASE_URL + userId;

        Object user = builder.build().get().uri(resourceUrl).retrieve().bodyToMono(Object.class).block();
        return ResponseEntity.ok(user);
    }
    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Long userId) {
        WebClient.Builder builder = WebClient.builder();
        String BASE_URL = "http://localhost:8080/api/users/";
        String resourceUrl = BASE_URL + userId;

        Object user = builder.build().delete().uri(resourceUrl).retrieve().bodyToMono(Object.class).block();
        return ResponseEntity.noContent().build();

    }
    @PutMapping("/{userId}")
    public ResponseEntity<?> updateUser(@PathVariable Long userId, @RequestBody Object updatedUser) {
        WebClient.Builder builder = WebClient.builder();
        String BASE_URL = "http://localhost:8080/api/users/";
        String resourceUrl = BASE_URL + userId;

        builder.build().put().uri(resourceUrl).retrieve().bodyToMono(Object.class).block();
        return ResponseEntity.noContent().build();

    }
}
