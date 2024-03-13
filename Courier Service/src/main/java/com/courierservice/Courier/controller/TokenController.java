package com.courierservice.Courier.controller;

import com.courierservice.Courier.entity.TokenEntity;
import com.courierservice.Courier.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tokens")
public class TokenController {

    private final TokenService tokenService;

    @Autowired
    public TokenController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @GetMapping
    public ResponseEntity<List<TokenEntity>> getAllTokens() {
        List<TokenEntity> tokens = tokenService.getAllTokens();
        return ResponseEntity.ok(tokens);
    }

    @GetMapping("/{tokenId}")
    public ResponseEntity<TokenEntity> getTokenById(@PathVariable Long tokenId) {
        return tokenService.getTokenById(tokenId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TokenEntity> createToken(@RequestBody TokenEntity tokenEntity) {
        TokenEntity createdToken = tokenService.saveToken(tokenEntity);
        return ResponseEntity.ok(createdToken);
    }

    @DeleteMapping("/{tokenId}")
    public ResponseEntity<Void> deleteToken(@PathVariable Long tokenId) {
        tokenService.deleteToken(tokenId);
        return ResponseEntity.noContent().build();
    }
}