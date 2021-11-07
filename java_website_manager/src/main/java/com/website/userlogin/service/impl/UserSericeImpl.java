package com.website.userlogin.service.impl;

import com.alibaba.fastjson.JSON;
import com.website.userlogin.entity.QueryInfo;
import com.website.userlogin.entity.User;
import com.website.userlogin.mapper.UserMapper;
import com.website.userlogin.service.UserSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.HashMap;
import java.util.List;

@Service
public class UserSericeImpl implements UserSerice {
    @Autowired
    UserMapper userMapper;


    public String userLogin( User user) {
        System.out.println("User : " + user);
        String str = "error";
        int count = userMapper.getUserByMassage(user.getUsername(), user.getPassword());
        if (count > 0) {
            str = "ok";
        }
        return str;
    }

    public String getUserList(QueryInfo queryInfo){
        System.out.println(queryInfo);
        int numbers = userMapper.getUserCounts("%"+queryInfo.getQuery()+"%");// 获取数据总数
        int pageStart = (queryInfo.getPageNum()-1)*queryInfo.getPageSize();
        List<User> users = userMapper.getAllUser("%"+queryInfo.getQuery()+"%",pageStart,queryInfo.getPageSize());
        HashMap<String, Object> res = new HashMap<>();
        res.put("numbers",numbers);
        res.put("data",users);
        System.out.println("总条数："+numbers);
        String users_json = JSON.toJSONString(res);
        return users_json;
    }

    public String updateUserState(Integer  id, Boolean state){
        int i = userMapper.updateState(id, state);
        System.out.println("用户编号:"+id);
        System.out.println("用户状态:"+state);
        String str = i >0?"success":"error";
        return str;
    }

    public String addUser( User user){
        System.out.println(user);
        user.setRole("普通用户");
        user.setState(false);
        int i = userMapper.addUser(user);
        String str = i >0?"success":"error";
        return str;
    }

    public String getUpdateUser(int id){
        System.out.println("编号:"+id);
        User updateUser = userMapper.getUpdateUser(id);
        String users_json = JSON.toJSONString(updateUser);
        return users_json;
    }

    public String editUser(User user){
        System.out.println(user);
        int i = userMapper.editUser(user);
        String str = i >0?"success":"error";
        return str;
    }

    public String deleteUser(int id){
        System.out.println(id);
        int i = userMapper.deleteUser(id);
        String str = i >0?"success":"error";
        return str;
    }
}
