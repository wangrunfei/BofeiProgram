package com.bofei.BofeiProgram.frame.service;

import com.bofei.BofeiProgram.frame.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getUserInfo();

    public void insert(User user);
}
