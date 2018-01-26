package com.ek.mybatis.day2.many2many.pojo;

import java.util.Date;
import java.util.List;
/**
 * 用户表 m_users
 * @author EK
 * @date 2017年8月26日
 */
public class UsersM2M {
  private Integer id;
  private String userName;
  private Date birthday;
  private String sex;
  private String address;
  
  //订单集合 用户到订单 一对多
  private List<OrdersM2M> ordersList;
  
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public List<OrdersM2M> getOrdersList() {
    return ordersList;
  }

  public void setOrdersList(List<OrdersM2M> ordersList) {
    this.ordersList = ordersList;
  }

  @Override
  public String toString() {
    return "UsersM2M [id=" + id + ", userName=" + userName + ", birthday=" + birthday + ", sex=" + sex + ", address="
        + address + ", ordersList=" + ordersList + "]";
  }
}