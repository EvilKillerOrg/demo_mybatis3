package com.ek.mybatis.day2.one2many.pojo;

import java.util.Date;
import java.util.List;
/**
 * 订单 m_orders
 * @author EK
 * @date 2017年8月26日
 */
public class OrdersO2M {

  private Integer id;
  private Integer userId;
  private String number;
  private Date createTime;
  private String note;
  
  //Orders到Users 一对一
  private UsersO2M users;
  
  //Orders到OrderDetail 一对多
  private List<OrderDetailO2M> orderDetails;
  
  
  

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

  public UsersO2M getUsers() {
    return users;
  }

  public void setUsers(UsersO2M users) {
    this.users = users;
  }

  public List<OrderDetailO2M> getOrderDetails() {
    return orderDetails;
  }

  public void setOrderDetails(List<OrderDetailO2M> orderDetails) {
    this.orderDetails = orderDetails;
  }

  @Override
  public String toString() {
    return "OrdersO2M [id=" + id + ", userId=" + userId + ", number=" + number + ", createTime=" + createTime
        + ", note=" + note + ", users=" + users + ", orderDetails=" + orderDetails + "]";
  }
}