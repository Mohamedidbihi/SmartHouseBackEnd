package com.example.smarthouse.service;

import com.example.smarthouse.entity.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public User saveUser(String username, String password) {

        return null;
    }

    @Override
    public User updateUser(String username, String password) {

        return null;
    }

    @Override
    public boolean deleteUser(String username) {
        return false;
    }

    @Override
    public User findUser(String username) {
        // get user by us ername
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
    @Override
    public boolean isUserExist(String username) {
        return false;
    }

}
