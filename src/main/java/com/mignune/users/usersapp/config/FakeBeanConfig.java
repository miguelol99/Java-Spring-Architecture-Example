package com.mignune.users.usersapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.javafaker.Faker;

@Configuration
public class FakeBeanConfig {
    
    @Bean
    public Faker getFaker() {
        return new Faker();
    }
}
