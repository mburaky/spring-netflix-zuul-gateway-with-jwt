package com.justmop.zuulwithjwt.controller;

import com.justmop.zuulwithjwt.models.api.AuthenticationRequest;
import com.justmop.zuulwithjwt.models.api.AuthenticationResponse;
import com.justmop.zuulwithjwt.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        String jwtToken = authenticationService.generateJwt(authenticationRequest);
        return ResponseEntity.ok(new AuthenticationResponse(jwtToken));
    }
}
