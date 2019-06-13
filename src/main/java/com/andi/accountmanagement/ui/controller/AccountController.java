package com.andi.accountmanagement.ui.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping(value = "/status/check")
    public String checkHealth() {
        return "account managements works";
    }

}
