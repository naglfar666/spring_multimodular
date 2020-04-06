package com.multimodular.web.controller;

import com.multimodular.email.EmailService;
import com.multimodular.web.model.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/test")
public class TestController {

    @Autowired
    private EmailService emailService;

    @GetMapping(path = "/")
    public ResponseEntity<?> index() {
        emailService.test();
        return ResponseModel.successPure();
    }
}
