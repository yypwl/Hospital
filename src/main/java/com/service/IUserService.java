package com.service;

import com.pojo.User;

import java.util.List;

public interface IUserService {

    User login(String username,String password);

    List<User> getAllUsers();
}
