package com.example.NimsaraTest.controller;

import com.example.NimsaraTest.dto.UserDTO;
import com.example.NimsaraTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//annotations
@RestController
@RequestMapping(value="api/v1/user")
@CrossOrigin

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")//identify getUser() method as a get request
    public String getUser(){
        return "Simple-Root";
    }

    @PutMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){ //json type to java type convert
        return userService.saveUser(userDTO);
    }
}