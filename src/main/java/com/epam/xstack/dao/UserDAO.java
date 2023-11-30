package com.epam.xstack.dao;

import com.epam.xstack.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUser();

    void saveUser(User user);

    public User getUser(int id);

    void deleteUser(int id);
}
