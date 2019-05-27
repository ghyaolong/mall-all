package com.buildinglife.mall.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_express")
public class TbExpress {
    /**
     * 快递ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商品描述
     */
    @Column(name = "express_name")
    private String expressName;

    /**
     * 排序
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    /**
     * 获取快递ID
     *
     * @return id - 快递ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置快递ID
     *
     * @param id 快递ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品描述
     *
     * @return express_name - 商品描述
     */
    public String getExpressName() {
        return expressName;
    }

    /**
     * 设置商品描述
     *
     * @param expressName 商品描述
     */
    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    /**
     * 获取排序
     *
     * @return sort_order - 排序
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置排序
     *
     * @param sortOrder 排序
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 获取创建时间
     *
     * @return created - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取更新时间
     *
     * @return updated - 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置更新时间
     *
     * @param updated 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}