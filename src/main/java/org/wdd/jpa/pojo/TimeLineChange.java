package org.wdd.jpa.pojo;




import javax.persistence.*;

/**
 * @Description TimeLineChange
 * @Author weidongdong
 * @Date 2020/5/15 10:48
 * @Version 1.0
 */
@Entity
@Table(name = "module_tl_time_chain_change")
public class TimeLineChange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true)
    private Integer id;
    @Column(name = "article_id")
    private String articleId;
    @Column(name = "distribute_article_id")
    private String distributeArticleId;
    @Column(name = "time_chain_type")
    private String timeChainType;
    @Column(name = "syn_state")
    private String synState;
    @Column(name = "create_time")
    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getDistributeArticleId() {
        return distributeArticleId;
    }

    public void setDistributeArticleId(String distributeArticleId) {
        this.distributeArticleId = distributeArticleId;
    }

    public String getTimeChainType() {
        return timeChainType;
    }

    public void setTimeChainType(String timeChainType) {
        this.timeChainType = timeChainType;
    }

    public String getSynState() {
        return synState;
    }

    public void setSynState(String synState) {
        this.synState = synState;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
