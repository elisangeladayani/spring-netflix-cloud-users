package com.cit.dojo.user.domain;

/**
 * Created by Dayani on 03/03/16.
 */
public class User {

    String id;

    String name;

    public User() {

    }

    public User(String id, String name) {
        this.id = id;
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
