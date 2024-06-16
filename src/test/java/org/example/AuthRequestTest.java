package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthRequestTest {

    AuthRequest authRequest = new AuthRequest();

    @Test
    void getUsername() {
        authRequest.getUsername();
    }

    @Test
    void setUsername() {
        authRequest.setUsername("username");
    }

    @Test
    void getPassword() {

        authRequest.getPassword();
    }

    @Test
    void setPassword() {
        authRequest.setPassword("password");
    }
}