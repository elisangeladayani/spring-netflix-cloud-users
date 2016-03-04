package com.cit.dojo.user;

import com.cit.dojo.user.domain.User;
import jersey.repackaged.com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class ApplicationConfiguration {


    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationConfiguration.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfiguration.class, args);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public User findById(@PathVariable String id) {
        LOGGER.info("********* Find User By Id {} *****************", id);
        return new User("1", "Thor");
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = {"application/json"})
    public ArrayList<User> findAll() {
        LOGGER.info("********** Find All *****************");

        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            LOGGER.error("Error find all", e);
        }
        return Lists.newArrayList(new User("1", "Thor"), new User("2", "Wolverine"), new User("3", "Hulk"));
    }
}
