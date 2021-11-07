package com.website.userlogin.controller;

import com.website.userlogin.entity.User;
import com.website.userlogin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    UserMapper userMapper;

    @CrossOrigin
    @RequestMapping("/login")
    public String userLogin(@RequestBody User user) {
        System.out.println("User : " + user);
        String str = "error";
        int count = userMapper.getUserByMassage(user.getUsername(), user.getPassword());
        if (count > 0) {
            str = "ok";
        }
        return str;
    }

}
