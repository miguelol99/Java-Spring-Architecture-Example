package com.mignune.users.usersapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mignune.users.usersapp.entities.Profile;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Integer> {
    
}
