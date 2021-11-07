package com.website.userlogin.service.impl;

import com.alibaba.fastjson.JSON;
import com.website.userlogin.entity.MainMenu;
import com.website.userlogin.mapper.MenuMapper;
import com.website.userlogin.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    public String getAllMenus(){
        HashMap<String, Object> data = new HashMap<>();
        List<MainMenu> mainMenus = menuMapper.getMainMenus();
        data.put("data",mainMenus);
        data.put("status",200);
        String data_json = JSON.toJSONString(data);
        System.out.println("成功访问！！！");
        return data_json;
    }
}
