package com.example.projectend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author Cheng
 * @date 2020-04-18-22:19
 */
@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session) {
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            System.out.println("LoginController");
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }else{
            map.put("msg", "用户名密码错误");
            return "login";
        }
    }
}
