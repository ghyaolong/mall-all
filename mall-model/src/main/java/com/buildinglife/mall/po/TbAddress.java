package com.buildinglife.mall.po;

import javax.persistence.*;

@Table(name = "tb_address")
public class TbAddress {
    @Id
    @Column(name = "address_id")
    private Long addressId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    private String tel;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "is_default")
    private Boolean isDefault;

    /**
     * @return address_id
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * @param addressId
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return street_name
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * @param streetName
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * @return is_default
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * @param isDefault
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
}