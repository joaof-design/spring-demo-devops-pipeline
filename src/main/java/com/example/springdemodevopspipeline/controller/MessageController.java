package com.example.springdemodevopspipeline.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @RequestMapping("/message")
    public String message(){
        return "Deploy to Azure k8s cluster with success!!";
    }
}
