package com.dimitar.di.controllers;

import com.dimitar.di.services.HelloService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Log
public class HelloControllerUsingPrimary {

    HelloService helloService;

    @Autowired
    public HelloControllerUsingPrimary(HelloService helloService) {
        this.helloService = helloService;
    }

    public void hello() {
        log.info("Hello from HelloControllerPrimaryService");
        helloService.hello();
    }
}
