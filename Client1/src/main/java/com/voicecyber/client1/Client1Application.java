package com.voicecyber.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

@SpringBootApplication
public class Client1Application extends SpringBootServletInitializer {
    @Bean
    public RequestContextListener requestContextListener(){
        return new RequestContextListener();
    }
    public static void main(String[] args) {
        SpringApplication.run(Client1Application.class, args);
    }
}