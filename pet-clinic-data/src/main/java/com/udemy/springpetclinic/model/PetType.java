package com.udemy.springpetclinic.model;

import lombok.Getter;

@Getter
public class PetType extends BaseEntity {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
