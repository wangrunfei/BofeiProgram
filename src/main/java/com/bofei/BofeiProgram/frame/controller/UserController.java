package com.bofei.BofeiProgram.frame.controller;

import com.bofei.BofeiProgram.frame.entity.User;
import com.bofei.BofeiProgram.frame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Date;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public List<User> getUserInfo(){
        List<User> user = userService.getUserInfo();
        System.out.println(user.toString());

        return user;
    }

    @RequestMapping("/addUserInfo")
    public String addUserInfo() {
        User user = new User();
        user.setId(3L);
        user.setName("王博");
        return "Success" + user.toString();
    }
}
