package com.example.authvivelibre.controller;

import com.example.authvivelibre.dto.TokenResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

public interface TokenApi {

  @GetMapping(value = "/get-token", produces = "application/json")
  Mono<TokenResponseDTO> getToken();

}
