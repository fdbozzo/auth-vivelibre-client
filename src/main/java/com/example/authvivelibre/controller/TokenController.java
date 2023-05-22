package com.example.authvivelibre.controller;

import com.example.authvivelibre.dto.TokenResponseDTO;
import com.example.authvivelibre.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TokenController implements TokenApi {

    @Autowired
    TokenService tokenService;

    @Override
    public Mono<TokenResponseDTO> getToken() {
        return this.tokenService.getToken("auth-vivelibre", "password");
    }

}
