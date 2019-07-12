package com.dimitar.di.services;

import lombok.extern.java.Log;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Log
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements HelloService {
    @Override
    public void hello() {
        log.info("Hello from the PRIMARY greeting service!");
    }
}
