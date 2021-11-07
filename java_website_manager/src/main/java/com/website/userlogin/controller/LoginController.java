package com.website.userlogin.controller;

import com.website.userlogin.entity.User;
import com.website.userlogin.service.UserSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    UserSerice userSerice;

    @RequestMapping("/login")
    public String userLogin(@RequestBody User user) {
        return userSerice.userLogin(user);
    }

}
