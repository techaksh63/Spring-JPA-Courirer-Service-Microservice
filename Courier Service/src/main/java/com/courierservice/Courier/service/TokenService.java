package com.courierservice.Courier.service;
import com.courierservice.Courier.entity.TokenEntity;
import com.courierservice.Courier.repository.TokenRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class TokenService {

    private final TokenRepository tokenRepository;

    @Autowired
    public TokenService(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    public List<TokenEntity> getAllTokens() {
        return tokenRepository.findAll();
    }

    public Optional<TokenEntity> getTokenById(Long tokenId) {
        return tokenRepository.findById(tokenId);
    }

    public TokenEntity saveToken(TokenEntity tokenEntity) {
        return tokenRepository.save(tokenEntity);
    }

    public void deleteToken(Long tokenId) {
        tokenRepository.deleteById(tokenId);
    }

}
