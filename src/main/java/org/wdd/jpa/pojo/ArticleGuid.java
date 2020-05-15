package org.wdd.jpa.pojo;



import javax.persistence.*;

/**
 * @Description ArticleGuid
 * @Author weidongdong
 * @Date 2020/5/15 9:43
 * @Version 1.0
 */
@Entity
@Table(name = "t_articleid_guid")
public class ArticleGuid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" )
    private Integer id;
    @Column(name = "article_id")
    private String articleId;
    @Column(name = "guid")
    private String guid;
    @Column(name = "tenant_id")
    private String tenantId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
