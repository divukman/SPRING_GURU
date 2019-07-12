package com.dimitar.di.services;

import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

@Service
@Log
public class HelloServiceImpl implements HelloService {

    @Override
    public void hello() {
        log.info("Hello from HelloServiceImpl");
    }
}
