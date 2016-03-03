package com.cit.dojo.user;

import com.cit.dojo.user.domain.UserTest;
import jersey.repackaged.com.google.common.collect.Lists;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PathParam;
import java.util.ArrayList;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class ApplicationConfiguration {


    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public UserTest findById(@PathParam("id") String id) {
        return new UserTest("1", "Thor");
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = {"application/json"})
    public ArrayList<UserTest> findAll() {
        return Lists.newArrayList(new UserTest("1","Thor"), new UserTest("2","Wolverine"), new UserTest("3","Hulk"));
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfiguration.class, args);
    }
}
