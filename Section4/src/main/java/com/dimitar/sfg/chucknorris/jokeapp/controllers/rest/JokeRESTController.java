package com.dimitar.sfg.chucknorris.jokeapp.controllers.rest;

import com.dimitar.sfg.chucknorris.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeRESTController {

    private final JokeService jokeService;

    @Autowired
    public JokeRESTController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/api/v1/joke")
    public ResponseEntity<?> getJoke() {
        return new ResponseEntity<String>(jokeService.getJoke(), HttpStatus.OK);
    }

}
