package com.dimitar.di.controllers;

import com.dimitar.di.services.HelloService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
@Log

public class HelloController {

    @Autowired
    @Qualifier("helloServiceImprovedImpl")
    HelloService helloService;


    public void hello() {
        log.info("Hello DI...");
        helloService.hello();
    }
}
