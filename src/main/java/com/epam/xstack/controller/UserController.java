package com.epam.xstack.controller;

import com.epam.xstack.model.User;
import com.epam.xstack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> showUsers() {
        List<User> allUser = userService.getAllUser();
        return allUser;
    }
}
