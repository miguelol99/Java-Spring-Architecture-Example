package com.mignune.users.usersapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mignune.users.usersapp.entities.Role;
import com.mignune.users.usersapp.repositories.RoleRepository;

@Service
public class RoleService {
    
    @Autowired
    private RoleRepository repository;

    public List<Role> getRoles() {    
        return repository.findAll();
    }
}
