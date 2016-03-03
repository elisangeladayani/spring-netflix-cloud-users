package com.citdojo.user;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public class Product {

    @Id
    String id;

    String name;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    /**
     * Getter for field id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Getter for field name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }


}
