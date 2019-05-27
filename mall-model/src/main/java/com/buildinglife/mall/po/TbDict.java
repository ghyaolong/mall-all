package com.buildinglife.mall.po;

import javax.persistence.*;

@Table(name = "tb_dict")
public class TbDict {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String dict;

    /**
     * 1扩展词 0停用词
     */
    private Integer type;

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
     * @return dict
     */
    public String getDict() {
        return dict;
    }

    /**
     * @param dict
     */
    public void setDict(String dict) {
        this.dict = dict;
    }

    /**
     * 获取1扩展词 0停用词
     *
     * @return type - 1扩展词 0停用词
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1扩展词 0停用词
     *
     * @param type 1扩展词 0停用词
     */
    public void setType(Integer type) {
        this.type = type;
    }
}