package com.example.projectend.service.impl;

import com.example.projectend.entity.User;
import com.example.projectend.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sound.midi.Soundbank;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Cheng
 * @date 2020-04-23-21:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration

public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findAll() {
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void getUserById() {
        System.out.println(userService.getUserById(1));
    }

    @Test
    public void deleteUserById() {
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setName("iloveyou");
        user.setPassword("333333");
        userService.addUser(user);
        System.out.println(userService.getUserById(5));
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(5);
        user.setName("lovesisi");
        user.setPassword("521521");
        userService.updateUser(user);
        System.out.println(userService.getUserById(5));
    }
}
