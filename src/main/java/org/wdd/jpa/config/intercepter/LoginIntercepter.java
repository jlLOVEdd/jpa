package org.wdd.jpa.config.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.wdd.jpa.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description LoginIntercepter
 * @Author weidongdong
 * @Date 2020/5/15 14:51
 * @Version 1.0
 */
public class LoginIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String path = request.getServletPath();
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("jpa_user");


        if ("/".equals(path) || "/login".equals(path)) {
            if (user == null) {
                return true;
            } else {
                response.sendRedirect("redirect:/main");
                return false;
            }

        }

        return true;

    }
}
