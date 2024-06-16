package org.example;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("auth")
public class AuthController {

  private static String jwtSecret = "IamSecret";

  @PostMapping
  public AuthResponse auth(@RequestBody AuthRequest authRequest) {
    String jwtToken = Jwts.builder()
        .setIssuer("orient")
        .claim("email", authRequest.getUsername())
        .setExpiration(Date.from(Instant.now().plus(15, ChronoUnit.MINUTES)))
        .signWith(SignatureAlgorithm.HS512, jwtSecret.getBytes())
        .compact();

    AuthResponse authResponse = new AuthResponse();
    authResponse.setAccessToken(jwtToken);
    return authResponse;
  }

}
