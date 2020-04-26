package com.example.projectend.service;


import com.example.projectend.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Cheng
 * @date 2020-04-23-20:07
 */
public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAll();

    User getUserById(Integer id);

    void deleteUserById(Integer id);

    void addUser(User user);

    void updateUser(User user);
}
