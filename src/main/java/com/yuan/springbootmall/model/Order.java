package com.yuan.springbootmall.model;

import java.util.Date;
import java.util.List;

public class Order {

    private Integer orderId;
    private Integer userId;
    private Integer totalAmount;
    private Date creatdDate;
    private Date lastModifiedDate;

    private List<OrderItem> orderItemList;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getCreatdDate() {
        return creatdDate;
    }

    public void setCreatdDate(Date creatdDate) {
        this.creatdDate = creatdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
