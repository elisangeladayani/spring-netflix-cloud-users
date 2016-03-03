package com.cit.dojo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PathParam;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class ApplicationConfiguration {

    @RequestMapping("/users/{id}")
    public User findById(@PathParam("id") String id) {
        return new User("1", "Teste");
    }

    @RequestMapping("/users")
    public String findAll() {
        return "Hello World ";
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfiguration.class, args);
    }
}
