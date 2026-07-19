package com.cognizant.springlearn.controller;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

// Controller handling user authentication and JWT generation
@RestController
public class AuthenticationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    // Authenticates user via Basic auth header and returns a JWT
    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("START");
        String user = getUser(authHeader); // Retrieve user from basic auth header
        String token = generateJwt(user); // Generate JWT token for user
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        LOGGER.info("END");
        return response;
    }

    // Decodes base64 Basic authorization header to extract the username
    private String getUser(String authHeader) {
        LOGGER.info("START");
        String encodedCredentials = authHeader.substring(6); // Remove "Basic " prefix
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials); // Decode base64 bytes
        String credentials = new String(decodedBytes); // Convert bytes to string
        String username = credentials.split(":")[0]; // Extract username before colon
        LOGGER.debug("Decoded user={}", username);
        LOGGER.info("END");
        return username;
    }

    // Generates a JWT token for the authenticated user
    private String generateJwt(String user) {
        LOGGER.info("START");
        JwtBuilder builder = Jwts.builder();
        builder.setSubject(user); // Subject is the username
        builder.setIssuedAt(new Date()); // Issue date is current time
        builder.setExpiration(new Date(System.currentTimeMillis() + 1200000)); // Expiry 20 minutes from now
        builder.signWith(SignatureAlgorithm.HS256, "secretkey"); // Sign token with secret key
        String token = builder.compact(); // Build compact JWT string
        LOGGER.info("END");
        return token;
    }
}
