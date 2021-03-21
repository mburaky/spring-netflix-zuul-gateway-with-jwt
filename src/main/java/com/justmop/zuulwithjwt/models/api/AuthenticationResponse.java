package com.justmop.zuulwithjwt.models.api;

public class AuthenticationResponse {

    private final String token;

    public AuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
