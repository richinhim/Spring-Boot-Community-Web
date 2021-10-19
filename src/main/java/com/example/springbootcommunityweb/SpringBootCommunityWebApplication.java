package com.example.springbootcommunityweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootCommunityWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCommunityWebApplication.class, args);
    }

    @GetMapping
    public String HelloWorld(){
        return "Hello World!";
    }
}
