package com.mignune.users.usersapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mignune.users.usersapp.entities.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
    

    
}
