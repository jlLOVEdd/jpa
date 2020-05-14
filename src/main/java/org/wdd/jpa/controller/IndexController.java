package org.wdd.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wdd.jpa.service.TestService;

/**
 * @Description IndexController
 * @Author weidongdong
 * @Date 2020/5/14 9:35
 * @Version 1.0
 */
@Controller
public class IndexController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public String testSuccess(String name) {
        return testService.aopTest(name);
    }
}
