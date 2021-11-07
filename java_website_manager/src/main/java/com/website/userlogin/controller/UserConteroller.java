package com.website.userlogin.controller;

import com.website.userlogin.entity.QueryInfo;
import com.website.userlogin.entity.User;
import com.website.userlogin.service.UserSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserConteroller {

    @Autowired
    UserSerice UserSerice;

    @RequestMapping("/allUser")
    public String getUserList(QueryInfo queryInfo) {
        return UserSerice.getUserList(queryInfo);
    }

    @RequestMapping("/userState")
    public String updateUserState(@RequestParam("id") Integer id, @RequestParam("state") Boolean state) {
        return UserSerice.updateUserState(id, state);
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user) {
        return UserSerice.addUser(user);
    }

    @RequestMapping("/getUpdate")
    public String getUpdateUser(int id) {

        return UserSerice.getUpdateUser(id);
    }

    @RequestMapping("/editUser")
    public String editUser(@RequestBody User user) {
        return UserSerice.editUser(user);
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(int id) {
        return UserSerice.deleteUser(id);
    }

}
