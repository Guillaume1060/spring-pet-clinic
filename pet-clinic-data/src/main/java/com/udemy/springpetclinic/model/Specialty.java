package com.udemy.springpetclinic.model;

import lombok.Getter;

@Getter
public class Specialty extends BaseEntity{
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }
}
