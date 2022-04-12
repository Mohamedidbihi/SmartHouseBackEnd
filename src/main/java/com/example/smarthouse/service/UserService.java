package com.example.smarthouse.service;

import com.example.smarthouse.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(String username, String password);

    User updateUser(String username, String password);

    boolean deleteUser(String username);

    User findUser(String username);

    List<User> findAllUsers();

    boolean isUserExist(String username);

}
