package com.udemy.springpetclinic.services;

import com.udemy.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
