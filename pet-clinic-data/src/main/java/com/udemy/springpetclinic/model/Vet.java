package com.udemy.springpetclinic.model;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class Vet extends Person {
    private Set<Specialty> specialties = new HashSet<>();

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
