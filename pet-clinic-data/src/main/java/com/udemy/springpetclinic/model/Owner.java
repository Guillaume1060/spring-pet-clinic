package com.udemy.springpetclinic.model;

import lombok.Getter;

import java.util.Set;

@Getter
public class Owner extends Person{

    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
