package com.mignune.users.usersapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mignune.users.usersapp.entities.Role;
import com.mignune.users.usersapp.services.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {
    
    @Autowired
    private RoleService service;

    @GetMapping
    public ResponseEntity<List<Role>> get() {
        return new ResponseEntity<List<Role>>(service.getRoles(), HttpStatus.OK);
    }
}
