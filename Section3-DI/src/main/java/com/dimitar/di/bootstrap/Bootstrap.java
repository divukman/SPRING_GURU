package com.dimitar.di.bootstrap;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Log
public class Bootstrap implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        log.info("Bootstrap Done...");
    }
}
