package com.website.userlogin.mapper;

import com.website.userlogin.entity.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MenuMapper {
    public List<MainMenu> getMainMenus();

}
