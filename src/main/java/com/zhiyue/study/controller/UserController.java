package com.zhiyue.study.controller;

import com.zhiyue.study.pojo.User;
import com.zhiyue.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description
 * @Project vue-web-ssm
 * @Author ZhiYue
 * @Date 2020/6/3 21:15
 */
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("findAll")
    public List<User> findAll() {
        System.out.println("test");
        return userService.findAll();
    }

    /**
     * 通过id查询指定用户
     * @param id
     * @return
     */
    @RequestMapping("find")
    public User find(Integer id) {
        return userService.findOne(id);
    }

    /**
     * 修改用户信息
     * @param user
     */
    @RequestMapping("update")
    public void update(@RequestBody User user) {
        userService.updateUser(user);
    }
}
