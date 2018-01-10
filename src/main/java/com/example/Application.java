package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Online Food ordering and billing";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class, args);
    }
}
