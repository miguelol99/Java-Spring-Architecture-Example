package com.mignune.users.usersapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mignune.users.usersapp.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    
}
