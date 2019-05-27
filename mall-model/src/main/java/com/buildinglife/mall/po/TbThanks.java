package com.buildinglife.mall.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_thanks")
public class TbThanks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nick_name")
    private String nickName;

    private String username;

    private BigDecimal money;

    private String info;

    /**
     * 通知邮箱
     */
    private String email;

    /**
     * 状态 0待审核 1确认显示  2驳回 3通过不展示
     */
    private Integer state;

    /**
     * 支付方式
     */
    @Column(name = "pay_type")
    private String payType;

    /**
     * 关联订单id
     */
    @Column(name = "order_id")
    private String orderId;

    private Date date;

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
     * @return nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return money
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * @param money
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * @return info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 获取通知邮箱
     *
     * @return email - 通知邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置通知邮箱
     *
     * @param email 通知邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取状态 0待审核 1确认显示  2驳回 3通过不展示
     *
     * @return state - 状态 0待审核 1确认显示  2驳回 3通过不展示
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态 0待审核 1确认显示  2驳回 3通过不展示
     *
     * @param state 状态 0待审核 1确认显示  2驳回 3通过不展示
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取支付方式
     *
     * @return pay_type - 支付方式
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置支付方式
     *
     * @param payType 支付方式
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * 获取关联订单id
     *
     * @return order_id - 关联订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置关联订单id
     *
     * @param orderId 关联订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}