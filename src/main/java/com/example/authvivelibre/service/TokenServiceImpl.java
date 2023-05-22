package com.example.authvivelibre.service;

import com.example.authvivelibre.dto.TokenBody;
import com.example.authvivelibre.dto.TokenDTO;
import com.example.authvivelibre.dto.TokenResponseDTO;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Service
public class TokenServiceImpl implements TokenService {

  @Override
  public Mono<TokenDTO> postToken(String userName, String password) {
    String uri = "http://localhost:8080/token";
    TokenBody tokenBody = new TokenBody(userName, password);
    return WebClient
            .create()
            .post()
            .uri(uri)
            .body(Mono.just(tokenBody), TokenBody.class)
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(TokenDTO.class);

  }

  @Override
  public Mono<TokenResponseDTO> getToken(String userName, String password) {
    return postToken(userName, password)
            .map(tokenDto -> {
              TokenResponseDTO response = new TokenResponseDTO();
              // Obtener la fecha actual
              LocalDate fechaActual = LocalDate.now();

              // Definir el formato deseado
              DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);

              response.setAuthVivelibreToken(tokenDto.getToken());
              response.setDateTime(fechaActual.format(formatter));
              return response;
            });
  }

}
