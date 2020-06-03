package com.zhiyue.study.dao;

import com.zhiyue.study.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description 用户的持久层接口
 * @Project vue-web-ssm
 * @Author ZhiYue
 * @Date 2020/5/30 10:42
 */
public interface UserDao {

    /**
     * 查询用户列表
     *
     * @return List<User>
     */
    @Select("select * " +
            "from user")
    List<User> findAll();

    /**
     * 依据id查询用户
     *
     * @param id
     * @return User
     */
    @Select("select * from user where id = #{id}")
    User findOne(Integer id);

    /**
     * 更行用户
     * @param user
     */
    @Select("update user set username = #{username}, password = #{password}, age=#{age}, sex=#{sex}, email = #{email} where id = #{id}")
    void updateUser(User user);
}
