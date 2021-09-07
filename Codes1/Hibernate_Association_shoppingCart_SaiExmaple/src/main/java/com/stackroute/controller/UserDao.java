package com.stackroute.controller;

import java.util.List;

import com.stackroute.model.User;

public interface UserDao {
public boolean addUser(User user);
public List<User> listAllUser();
public User getUserByEmail(String email);
public User getUserById(int UserId);

}
