package com.udemy.springpetclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity{
    @Column(name = "description")
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }
}
