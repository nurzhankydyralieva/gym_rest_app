package com.epam.xstack.service;

import com.epam.xstack.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    void saveUser(User user);

    public User getUser(int id);

    void deleteUser(int id);
}
