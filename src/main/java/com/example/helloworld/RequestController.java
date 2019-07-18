package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Created Date: Thursday July 18th 2019
 * Author: Gurubalan Harikrishnan
 * Email-ID: gurubalan.work@gmail.com
 * -----
 * Copyright (c) 2019 Gurubalan Harikrishnan
 */
@Controller
public class RequestController {

    @Autowired
    UserRepository ur;

    @RequestMapping("home")
    public String home(){
        System.out.println("Listing sample data");
        ur.findAll().forEach(u -> System.out.println(u));
        return "index";
    }
}