package com.aishang.shop.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "spring..orders")
public class Orders {
    @Id
    private Integer oid;

    private Double total;

    private Date ordertime;

    /**
     * -1:订删除订单 0:待付款 1：待发货 2：待收货 3：已收货 
     */
    private Integer state;

    private String name;

    private String phone;

    private String addr;

    private Integer uid;

    /**
     * @return oid
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * @param oid
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * @return total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * @return ordertime
     */
    public Date getOrdertime() {
        return ordertime;
    }

    /**
     * @param ordertime
     */
    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    /**
     * 获取-1:订删除订单 0:待付款 1：待发货 2：待收货 3：已收货 
     *
     * @return state - -1:订删除订单 0:待付款 1：待发货 2：待收货 3：已收货 
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置-1:订删除订单 0:待付款 1：待发货 2：待收货 3：已收货 
     *
     * @param state -1:订删除订单 0:待付款 1：待发货 2：待收货 3：已收货 
     */
    public void setState(Integer state) {
        this.state = state;
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
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * @param addr
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }
}