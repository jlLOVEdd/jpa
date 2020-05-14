package org.wdd.jpa.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Description TestService
 * @Author weidongdong
 * @Date 2020/5/14 15:12
 * @Version 1.0
 */
@Service
public class TestService {

    Logger logger = LoggerFactory.getLogger(TestService.class);

    public String  aopTest(String name){
        logger.info("TestService---------");
        return "test";
    }
}
