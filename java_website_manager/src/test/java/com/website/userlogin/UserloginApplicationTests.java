package com.website.userlogin;

import com.website.userlogin.entity.MainMenu;
import com.website.userlogin.mapper.MenuMapper;
import com.website.userlogin.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserloginApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    MenuMapper menuMapper;

    @Test
    void contextLoads() {
//        List<User> ulist = userDao.getAllUser(null,0,2);
//        System.out.println("总人数为: "+ulist.size());
//        for (User us:ulist
//             ) {
//            System.out.println(us);
//        }

        List<MainMenu> mainMenus = menuMapper.getMainMenus();
        for (MainMenu mm:mainMenus) {
            System.out.println(mm);
        }
    }

}
