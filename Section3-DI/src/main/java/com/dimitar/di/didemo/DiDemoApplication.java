package com.dimitar.di.didemo;

import com.dimitar.di.controllers.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.dimitar.di")
public class DiDemoApplication {

    public static void main(String[] args) {
        final ApplicationContext context =  SpringApplication.run(DiDemoApplication.class, args);
        HelloController helloController = (HelloController) context.getBean("helloController");
        helloController.hello();
    }

}
