package com.buildinglife.mall.po;

import javax.persistence.*;

@Table(name = "tb_shiro_filter")
public class TbShiroFilter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String perms;

    @Column(name = "sort_order")
    private Integer sortOrder;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return perms
     */
    public String getPerms() {
        return perms;
    }

    /**
     * @param perms
     */
    public void setPerms(String perms) {
        this.perms = perms;
    }

    /**
     * @return sort_order
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * @param sortOrder
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}