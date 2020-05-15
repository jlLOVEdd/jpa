package org.wdd.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wdd.jpa.dao.TimeLineChangeDao;
import org.wdd.jpa.pojo.TimeLineChange;

import java.util.List;

/**
 * @Description TimeLineChange
 * @Author weidongdong
 * @Date 2020/5/15 10:55
 * @Version 1.0
 */
@Service
public class TimeLineChangeService {

    private TimeLineChangeDao timeLineChangeDao;

    @Autowired
    public void setTimeLineChangeDao(TimeLineChangeDao timeLineChangeDao) {
        this.timeLineChangeDao = timeLineChangeDao;
    }

    public List<TimeLineChange>  selectTimeLine(){
        return timeLineChangeDao.findAll();
    }

}
