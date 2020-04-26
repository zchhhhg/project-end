package com.example.projectend.mapper;

import com.example.projectend.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Cheng
 * @date 2020-04-23-20:07
 */

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> finAll();

    @Select("select * from user where id = #{id}")
    User getUserById(Integer id);

    @Delete("delete from user where id = #{id}")
    void deleteUserById(Integer id);

    /**
    @Options(useGeneratedKeys = true,keyProperty = "id")
     */
    @Insert("insert into user(name,password) values(#{name},#{password})")
    void addUser(User user);

    @Update("update user set name = #{name},password = #{password} where id = #{id}")
    void updateUser(User user);
}
