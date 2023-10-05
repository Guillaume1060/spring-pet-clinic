package com.udemy.springpetclinic.model;

import lombok.Getter;

import java.util.Set;

@Getter
public class Owner extends Person{
    private Set<Pet> pets;

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
