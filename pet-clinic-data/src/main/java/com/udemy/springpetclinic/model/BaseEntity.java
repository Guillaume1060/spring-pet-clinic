package com.udemy.springpetclinic.model;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class BaseEntity implements Serializable {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }
}
