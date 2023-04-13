package com.ewinner.hellospringboot.Services;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void CreateUser(){
        System.out.println("User has been created!");
    }
}
