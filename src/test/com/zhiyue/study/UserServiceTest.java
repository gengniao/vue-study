package com.zhiyue.study;

import com.zhiyue.study.pojo.User;
import com.zhiyue.study.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description
 * @Project vue-web-ssm
 * @Author ZhiYue
 * @Date 2020/5/30 10:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findAll() {
        List<User> users = userService.findAll();
        System.out.println(users);
    }
    @Test
    public void findOne() {
        User user = userService.findOne(1);
        System.out.println(user);
    }
    @Test
    public void updateUser() {
        User user = userService.findOne(1);
        System.out.println("修改前:"+user);
        user.setAge(55);
        userService.updateUser(user);
        user = userService.findOne(1);
        System.out.println("修改后:"+user);
    }
}
