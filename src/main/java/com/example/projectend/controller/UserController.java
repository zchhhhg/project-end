package com.example.projectend.controller;

import com.example.projectend.entity.User;
import com.example.projectend.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cheng
 * @date 2020-04-23-20:23
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        Logger logger = LoggerFactory.getLogger(UserController.class);
        logger.info("控制器查询某用户信息。。。");
        return userService.getUserById(id);
    }

}
