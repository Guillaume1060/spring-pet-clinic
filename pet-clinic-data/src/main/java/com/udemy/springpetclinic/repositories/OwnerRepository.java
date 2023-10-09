package com.udemy.springpetclinic.repositories;

import com.udemy.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
    Owner findByLastName (String lastName);
}
