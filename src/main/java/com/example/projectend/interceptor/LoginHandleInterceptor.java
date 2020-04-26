package com.example.projectend.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Cheng
 * @date 2020-04-18-23:13
 */
public class LoginHandleInterceptor implements HandlerInterceptor {
    /**
     * 此处并非先控制器再拦截器，而是设置了方向user/login不拦截，所有loginUser如果登陆了肯定是有值的
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
//        System.out.println(request.getSession().getAttribute("loginUser"));
//        if(request.getSession().getAttribute("loginUser") == null){
//            request.setAttribute("msg", "未登录");
//            request.getRequestDispatcher("/index.html").forward(request, response);
//            return false;
//        }else {
//            return true;
//        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
