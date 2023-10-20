package com.udemy.springpetclinic.services;

import com.udemy.springpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String LastName);
}
