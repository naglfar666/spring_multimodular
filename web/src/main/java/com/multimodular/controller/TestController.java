package com.multimodular.controller;

import com.multimodular.model.ResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/test")
public class TestController {

    @GetMapping(path = "/")
    public ResponseEntity<?> index() {
        return ResponseModel.successPure();
    }
}
