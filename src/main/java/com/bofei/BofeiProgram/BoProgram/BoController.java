package com.bofei.BofeiProgram.BoProgram;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoController {

    @RequestMapping("/")
    public String hello() {
        return "Hello";
    }
    @RequestMapping("/user")
    public String getUsers() {
        return "User";
    }
}
