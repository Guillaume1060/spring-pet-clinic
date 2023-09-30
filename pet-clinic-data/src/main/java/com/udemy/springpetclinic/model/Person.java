package com.udemy.springpetclinic.model;

import lombok.Getter;

@Getter
public class Person extends BaseEntity {
    private String firstname;
    private String lastname;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
