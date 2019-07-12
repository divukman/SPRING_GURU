package com.dimitar.di.services;

import lombok.extern.java.Log;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("de")
@Log
public class PrimaryGermanGreetingService implements HelloService {
    @Override
    public void hello() {
        log.info("Primarer Grusdienst");
    }
}
