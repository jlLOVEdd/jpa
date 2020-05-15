package org.wdd.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wdd.jpa.pojo.TimeLineChange;

/**
 * @Description TimeLineChangeDao
 * @Author weidongdong
 * @Date 2020/5/15 10:53
 * @Version 1.0
 */
public interface TimeLineChangeDao extends JpaRepository<TimeLineChange,Integer> {
}
