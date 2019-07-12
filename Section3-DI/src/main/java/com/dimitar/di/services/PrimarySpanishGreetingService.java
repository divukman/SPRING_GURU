package com.dimitar.di.services;

import lombok.extern.java.Log;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Log
@Primary
public class PrimarySpanishGreetingService implements HelloService {
    @Override
    public void hello() {
        log.info("Servicio de Saludo Primario");
    }
}
