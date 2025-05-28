package com.easyshop.cart_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(path = "/cart")
public class CartController {

    @GetMapping("/hello")
    public ResponseEntity<String> seyHello() {
        return ok().body("HELLO");
    }
}
