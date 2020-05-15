package org.wdd.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.wdd.jpa.exception.BusinessException;
import org.wdd.jpa.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description LoginController
 * @Author weidongdong
 * @Date 2020/5/15 16:13
 * @Version 1.0
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request, User user) {
        String name = user.getName();
        String password = user.getPassword();
        HttpSession session = request.getSession();
        if ("admin".equals(name) && "admin".equals(password)) {
            session.setAttribute("jpa_user", user);
            return "redirect:/main";
        } else {
            return "index";
        }
    }


    @RequestMapping("/main")
    public ModelAndView main(ModelAndView modelAndView) {
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @RequestMapping("/index")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/logout")
    public String logOut(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session =request.getSession();
        session.removeAttribute("jpa_user");
       return "redirect:/login";


    }

}
