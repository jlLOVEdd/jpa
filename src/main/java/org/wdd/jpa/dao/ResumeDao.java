package org.wdd.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.wdd.jpa.pojo.Resume;

/**
 * @Description ResumeDao
 * @Author weidongdong
 * @Date 2020/5/15 11:36
 * @Version 1.0
 */

public interface ResumeDao extends JpaRepository<Resume,Long>, PagingAndSortingRepository<Resume,Long> {

}
