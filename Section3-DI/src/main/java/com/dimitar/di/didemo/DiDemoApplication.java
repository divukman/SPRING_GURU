package com.dimitar.di.didemo;

import com.dimitar.di.controllers.HelloController;
import com.dimitar.di.controllers.HelloControllerUsingPrimary;
import com.dimitar.di.controllers.NewHelloController;
import com.dimitar.di.data.FakeDataSource;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.dimitar.di")
@Log
public class DiDemoApplication {


    public static void main(String[] args) {
        final ApplicationContext context =  SpringApplication.run(DiDemoApplication.class, args);


//        HelloController helloController = (HelloController) context.getBean("helloController");
//        helloController.hello();
//
//
//        NewHelloController newHelloController = (NewHelloController) context.getBean("newHelloController");
//        newHelloController.hello();
//
//
//        HelloControllerUsingPrimary helloControllerPrimaryService = (HelloControllerUsingPrimary) context.getBean("helloControllerUsingPrimary");
//        helloControllerPrimaryService.hello();


        final FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);
        log.info(fakeDataSource.toString());

    }

}
