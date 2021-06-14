package com.spring.demo.hello.controller;

import com.spring.demo.hello.entity.User;
import com.spring.demo.hello.repository.UserRepository;
import com.spring.demo.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public User hello(){
        return userService.findById(1);
    }

}
