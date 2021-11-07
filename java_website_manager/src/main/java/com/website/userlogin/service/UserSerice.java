package com.website.userlogin.service;

import com.website.userlogin.entity.QueryInfo;
import com.website.userlogin.entity.User;


public interface UserSerice {
    public String userLogin( User user);
    public String getUserList(QueryInfo queryInfo);
    public String updateUserState(Integer  id, Boolean state);
    public String addUser( User user);
    public String getUpdateUser(int id);
    public String editUser(User user);
    public String deleteUser(int id);
}
