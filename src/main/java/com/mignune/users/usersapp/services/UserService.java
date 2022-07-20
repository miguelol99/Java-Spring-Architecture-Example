package com.mignune.users.usersapp.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mignune.users.usersapp.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    
}
