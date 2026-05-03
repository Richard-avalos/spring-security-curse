package com.raavalos.spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path= "/balance")
public class BalanceController {
    @GetMapping
    public Map<String, String> balance() {
        // Bussiness Logic
        return Collections.singletonMap("msg", "Balance");
    }
}
