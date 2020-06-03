package com.zhiyue.study.service;

import com.zhiyue.study.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户的业务层接口
 */
public interface UserService {

    /**
     * 查询用户列表
     *
     * @return List<User>
     */
    List<User> findAll();

    /**
     * 依据id查询用户
     *
     * @param id
     * @return User
     */
    User findOne(Integer id);

    /**
     * 更行用户
     * @param user
     */
    void updateUser(User user);
}
