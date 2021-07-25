package com.jon.api.user.demo;

import io.jsonwebtoken.*;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Base64;
import java.util.Date;
import java.util.UUID;

@SpringBootTest
public class JwtTest {

    private long time  = 1000*60*60*24;
    private String signature = "jon";
    private String secret = Base64.getEncoder().encodeToString(signature.getBytes());

    @Test
    public void test(){

        JwtBuilder jwtBuilder = Jwts.builder();

        String token = jwtBuilder.setHeaderParam("typ", "jwt")
                .setHeaderParam("alg", "HS256")
                // payload
                .claim("username", "username")
                .claim("role", "role")
                .setSubject("jwt-test")
                .setExpiration(new Date(System.currentTimeMillis() + time))
                // signature
                .setId(UUID.randomUUID().toString())
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();

        System.out.println(token);
    }

    @Test
    public void parse(){
        String token = "eyJ0eXAiOiJqd3QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6InVzZXJuYW1lIiwicm9sZSI6InJvbGUiLCJzdWIiOiJqd3QtdGVzdCIsImV4cCI6MTYyNTIxMjcwNCwianRpIjoiMGNhMTZkYjYtZDY4NC00NTRkLTgzMmYtMzgzNGE1NzQ5ZmE5In0.bcBdhcgsBdYBAalQdXmAJaYBi8LIrXlrUTRivFIGb9Y";
        JwtParser parser = Jwts.parser();
        Jws<Claims> claimsJws = parser.setSigningKey(secret).parseClaimsJws(token);

        System.out.println(claimsJws.getSignature());
        Claims body = claimsJws.getBody();
        System.out.println(body.get("username"));
        System.out.println(body.get("role"));
        System.out.println(body.getExpiration());
    }
}
