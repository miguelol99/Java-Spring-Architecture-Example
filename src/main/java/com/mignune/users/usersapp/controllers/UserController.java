package com.mignune.users.usersapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mignune.users.usersapp.entities.User;
import com.mignune.users.usersapp.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
   
    // @GetMapping
    // public ResponseEntity<List<User>> get(@RequestParam(required = false) String startsWith) {
    //     return new ResponseEntity<List<User>>(userService.getAll(startsWith), HttpStatus.OK);
    // }

    // @PostMapping
    // public ResponseEntity<User> create(@RequestBody User user) {
    //     return new ResponseEntity<User>(userService.create(user), HttpStatus.CREATED);
    // }

    // @PutMapping("/{username}")
    // public ResponseEntity<User> update(@PathVariable String username,  @RequestBody User user) {
    //     return new ResponseEntity<User>(userService.update(username, user), HttpStatus.OK);
    // }

    // @DeleteMapping("/{username}")
    // public ResponseEntity<Void> delete(@PathVariable String username) {
    //     userService.delete(username);
    //     return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    // }

    // @GetMapping("/{username}")
    // public ResponseEntity<User> getByUsername(@PathVariable String username) {
    //     return new ResponseEntity<User>(userService.getByUsername(username), HttpStatus.OK);
    // }
}
