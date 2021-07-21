package com.jon.api.client.util;

import io.jsonwebtoken.*;

import java.util.Base64;
import java.util.Date;
import java.util.UUID;

public class JwtUtil {

    private static long time  = 1000*60*60*24;
    private static String signature = "jon";
    private static String secret = Base64.getEncoder().encodeToString(signature.getBytes());


    public static String jwt(String username, String role){

        JwtBuilder jwtBuilder = Jwts.builder();

        return jwtBuilder.setHeaderParam("typ", "jwt")
                .setHeaderParam("alg", "HS256")
                // payload
                .claim("username", username)
                .claim("role", role)
                .setSubject("jwt-test")
                .setExpiration(new Date(System.currentTimeMillis() + time))
                // signature
                .setId(UUID.randomUUID().toString())
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }

    public static boolean parse(String token){
        JwtParser parser = Jwts.parser();
        try {
            Jws<Claims> claimsJws = parser.setSigningKey(secret).parseClaimsJws(token);
        } catch (Exception e) {
            return false;
        }
        return true;
    }



}
