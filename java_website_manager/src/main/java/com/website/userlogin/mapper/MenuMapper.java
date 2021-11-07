package com.website.userlogin.mapper;

import com.website.userlogin.entity.MainMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MenuMapper {
     List<MainMenu> getMainMenus();

}
