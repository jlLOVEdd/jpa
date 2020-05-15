package org.wdd.jpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.wdd.jpa.pojo.ArticleGuid;

/**
 * @Description ArticleGuidDao
 * @Author weidongdong
 * @Date 2020/5/15 9:36
 * @Version 1.0
 */

public interface ArticleGuidDao extends CrudRepository<ArticleGuid, Integer> {
}
