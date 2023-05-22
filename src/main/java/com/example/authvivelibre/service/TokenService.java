package com.example.authvivelibre.service;

import com.example.authvivelibre.dto.TokenDTO;
import com.example.authvivelibre.dto.TokenResponseDTO;
import reactor.core.publisher.Mono;

public interface TokenService {

    Mono<TokenDTO> postToken(String userName, String password);

    Mono<TokenResponseDTO> getToken(String userName, String password);

}
