package com.zhiyue.study.service.impl;

import com.zhiyue.study.dao.UserDao;
import com.zhiyue.study.pojo.User;
import com.zhiyue.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Project vue-web-ssm
 * @Author ZhiYue
 * @Date 2020/5/30 10:51
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOne(Integer id) {
        return userDao.findOne(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
