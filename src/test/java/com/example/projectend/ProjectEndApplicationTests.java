package com.example.projectend;

import com.example.projectend.entity.User;
import com.example.projectend.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProjectEndApplicationTests {

    @Autowired
    RedisTemplate<Object,User> userRedisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    void testRedis(){
        User user = userService.getUserById(1);
        userRedisTemplate.opsForValue().set("user01", user);
        System.out.println(userRedisTemplate.opsForValue().get("user01"));
    }

}
