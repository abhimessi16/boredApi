package com.abhimessi.boredApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BoredApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(BoredApp.class, args);

    }
}