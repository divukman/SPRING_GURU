package com.dimitar.di.controllers;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;

@Controller
@Log
public class HelloController {

    public void hello() {
        log.info("Hello DI...");
    }
}
