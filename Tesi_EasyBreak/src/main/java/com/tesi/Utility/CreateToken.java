package com.tesi.Utility;

import io.jsonwebtoken.Jwts;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.UUID;

public class CreateToken {
    long now = System.currentTimeMillis();
    public String generateToken(){
        String jwtToken = Jwts.builder()
                .claim("name", "Jane Doe")
                .claim("email", "jane@example.com")
                .setSubject("jane")
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(Date.from(Instant.ofEpochSecond(now)))
                .setExpiration(Date.from(Instant.ofEpochSecond(now).plus(5l, ChronoUnit.MINUTES)))
                .compact();
        return jwtToken;
    }



}
