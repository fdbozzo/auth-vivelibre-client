package com.example.authvivelibre.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenResponseDTO implements Serializable {

  @JsonProperty("auth-vivelibre-token")
  String authVivelibreToken;

  @JsonProperty("date")
  String dateTime;
}
