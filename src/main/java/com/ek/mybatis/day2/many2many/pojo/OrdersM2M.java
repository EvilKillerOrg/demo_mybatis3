package com.ek.mybatis.day2.many2many.pojo;

import java.util.Date;
import java.util.List;
/**
 * 订单 m_orders
 * @author EK
 * @date 2017年8月26日
 */
public class OrdersM2M {

  private Integer id;
  private Integer userId;
  private String number;
  private Date createTime;
  private String note;
  
 
  //Orders到OrderDetail 一对多
  private List<OrderDetailM2M> orderDetailList;
  
  
  

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public List<OrderDetailM2M> getOrderDetailList() {
    return orderDetailList;
  }

  public void setOrderDetailList(List<OrderDetailM2M> orderDetailList) {
    this.orderDetailList = orderDetailList;
  }

  @Override
  public String toString() {
    return "OrdersM2M [id=" + id + ", userId=" + userId + ", number=" + number + ", createTime=" + createTime
        + ", note=" + note + ", orderDetailList=" + orderDetailList + "]";
  }
}