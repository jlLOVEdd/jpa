package org.wdd.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wdd.jpa.dao.ResumeDao;
import org.wdd.jpa.pojo.Resume;

/**
 * @Description ResumeService
 * @Author weidongdong
 * @Date 2020/5/15 11:37
 * @Version 1.0
 */
@Service
public class ResumeService {

    private ResumeDao resumeDao;

    @Autowired
    public void setResumeDao(ResumeDao resumeDao) {
        this.resumeDao = resumeDao;
    }

    public Resume selectResumeByid(Long id){
        return resumeDao.findById(id).get();
    }
}
