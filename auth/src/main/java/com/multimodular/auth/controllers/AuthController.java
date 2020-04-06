package com.multimodular.auth.controllers;


import com.multimodular.auth.model.ResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/auth")
public class AuthController {

    @GetMapping(path = "/")
    public ResponseEntity<?> index() {
        return ResponseModel.successPure();
    }
}
