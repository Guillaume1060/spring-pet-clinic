package com.udemy.springpetclinic.model;

import lombok.Getter;

@Getter
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }
}
