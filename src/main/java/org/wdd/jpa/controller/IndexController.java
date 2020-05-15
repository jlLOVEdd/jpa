package org.wdd.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wdd.jpa.exception.BusinessException;
import org.wdd.jpa.pojo.Resume;
import org.wdd.jpa.pojo.TimeLineChange;
import org.wdd.jpa.service.ResumeService;
import org.wdd.jpa.service.TestService;
import org.wdd.jpa.service.TimeLineChangeService;

import java.util.List;

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

    private TimeLineChangeService timeLineChangeService;

    private ResumeService resumeService;

    @Autowired
    public void setResumeService(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @Autowired
    public void setTimeLineChangeService(TimeLineChangeService timeLineChangeService) {
        this.timeLineChangeService = timeLineChangeService;
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String testSuccess(String name) {
        return testService.aopTest(name);
    }

    @ResponseBody
    @RequestMapping(value = "/timeLine")
    public List<TimeLineChange> selectAll(){
        return timeLineChangeService.selectTimeLine();
    }


    @ResponseBody
    @RequestMapping(value = "/resume")
    public Resume getResume(Long id){
        if(id==null){
            throw  new BusinessException(BusinessException.ExceptionStatus.PARAM_ERROR);
        }
        return this.resumeService.selectResumeByid(id);
    }
}
