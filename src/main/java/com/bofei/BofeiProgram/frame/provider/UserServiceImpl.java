package com.bofei.BofeiProgram.frame.provider;

import com.bofei.BofeiProgram.frame.entity.User;
import com.bofei.BofeiProgram.frame.mapper.UserMapper;
import com.bofei.BofeiProgram.frame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUserInfo() {
        return userMapper.findUserInfo();
    }

    @Override
    public void insert(User user) {
        userMapper.addUserInfo(user);
    }
}
