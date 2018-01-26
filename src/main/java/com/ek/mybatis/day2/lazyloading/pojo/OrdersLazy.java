package com.ek.mybatis.day2.lazyloading.pojo;

import java.util.Date;
/**
 * 订单 m_orders
 * 这里用来测试查询订单关联查询用户信息时 用户信息的查询为懒惰加载
 * 也就是说查询说查询订单的时候用到user再去查user
 * @author EK
 * @date 2017年8月26日
 */
public class OrdersLazy {

  private Integer id;
  private Integer userId;
  private String number;
  private Date createTime;
  private String note;
  
 
  private UsersLazy users;
  
  

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

  public UsersLazy getUsers() {
    return users;
  }

  public void setUsers(UsersLazy users) {
    this.users = users;
  }

  
}