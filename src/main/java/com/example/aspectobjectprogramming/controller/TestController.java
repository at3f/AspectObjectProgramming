package com.example.aspectobjectprogramming.controller;

import com.example.aspectobjectprogramming.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping
    public void endpoint(){
        try{
            System.out.println(testService.method());
            System.out.println(testService.method2());
        }catch (Exception e){
            System.out.println("catched");
        }
    }
}
