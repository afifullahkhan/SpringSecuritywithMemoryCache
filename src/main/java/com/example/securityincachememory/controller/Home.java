package com.example.securityincachememory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("v1")
public class Home {

    @GetMapping()
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("getLoginUser")
    public String getLoginUser(Principal principal){
        return principal.getName();
    }
}
