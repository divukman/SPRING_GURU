package com.dimitar.di.controllers;

import com.dimitar.di.services.HelloService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
@Log
public class NewHelloController {

    private HelloService helloService;

   @Autowired
   public NewHelloController(@Qualifier("helloServiceImpl") HelloService helloService) {
       this.helloService = helloService;
   }

   public void hello() {
       log.info("----------------------------------------");
       log.info("NewHelloController");
       this.helloService.hello();
   }

}
