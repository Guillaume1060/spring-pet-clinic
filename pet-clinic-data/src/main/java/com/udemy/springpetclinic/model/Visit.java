package com.udemy.springpetclinic.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;
    private Pet pet;

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
