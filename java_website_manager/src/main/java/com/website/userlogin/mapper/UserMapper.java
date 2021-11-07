package com.website.userlogin.mapper;

import com.website.userlogin.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

     int getUserByMassage(@Param("username") String username, @Param("password") String password);
     List<User> getAllUser(@Param("username") String username, @Param("pageStart") int pageStart, @Param("pageSize") int pageSize);
     int getUserCounts(@Param("username") String username);
     int updateState(Integer id, Boolean state);
     int addUser(User user);
     User getUpdateUser(int id);
     int editUser(User user);
     int deleteUser(int id);

}
