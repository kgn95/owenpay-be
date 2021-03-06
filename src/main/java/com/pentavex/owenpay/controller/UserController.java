package com.pentavex.owenpay.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import swaggergen.controller.UserApi;
import swaggergen.model.CreateUserRequest;
import swaggergen.model.CreateUserResponse;

import javax.validation.Valid;

@RestController
public class UserController implements UserApi {

    @Override
    public ResponseEntity<CreateUserResponse> createUser(@Valid @RequestBody CreateUserRequest request) {
        CreateUserResponse response = new CreateUserResponse();
        response.setMessage(request.getUsername());
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
