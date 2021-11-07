package com.website.userlogin.entity;

import lombok.Data;

import java.util.List;
@Data
public class MainMenu {
    private int id;
    private String title;
    private String path;
    List<SubMenu> slist;

}
