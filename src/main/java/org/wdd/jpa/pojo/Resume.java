package org.wdd.jpa.pojo;

import javax.persistence.*;

/**
 * @Description Resume
 * @Author weidongdong
 * @Date 2020/5/15 11:33
 * @Version 1.0
 */

@Entity
@Table(name = "tb_resume")
public class Resume {
    @Column(name = "id" ,unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "address")
    private String address;
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
