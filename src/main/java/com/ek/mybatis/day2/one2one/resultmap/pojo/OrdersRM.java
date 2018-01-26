package com.ek.mybatis.day2.one2one.resultmap.pojo;

import java.util.Date;
/**
 * 订单 m_orders
 * @author EK
 * @date 2017年8月26日
 */
public class OrdersRM {

  private Integer id;
  private Integer userId;
  private String number;
  private Date createTime;
  private String note;
  
  private UsersRM users;

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

  public UsersRM getUsers() {
    return users;
  }

  public void setUsers(UsersRM users) {
    this.users = users;
  }

  @Override
  public String toString() {
    return "OrdersRM [id=" + id + ", userId=" + userId + ", number=" + number + ", createTime=" + createTime + ", note="
        + note + ", users=" + users + "]";
  }
}