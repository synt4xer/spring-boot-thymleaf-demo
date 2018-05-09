package com.example.service;

import com.example.model.User;

/**
 * Created by IntelliJ IDEA.
 * User: FERREL JOHN FERNANDO
 * Date: 5/8/2018.
 * Time: 8:19 PM.
 */
public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}