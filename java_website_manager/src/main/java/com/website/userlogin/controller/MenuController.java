package com.website.userlogin.controller;


import com.website.userlogin.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MenuController {
    @Autowired
    MenuService menuService;

    @RequestMapping("/menus")
    public String getAllMenus() {
        return menuService.getAllMenus();
    }
}

