package com.udemy.springpetclinic.model;

import lombok.Getter;

@Getter
public class Person extends BaseEntity {
    private String firstname;
    private String lastname;

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
}
