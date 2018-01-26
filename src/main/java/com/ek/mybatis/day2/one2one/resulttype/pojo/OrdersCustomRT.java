package com.ek.mybatis.day2.one2one.resulttype.pojo;

/**
 * 通过这个类映射订单和用户查询的结果 (通过resultType)
 * @author EK
 * @date 2017年8月26日
 */
public class OrdersCustomRT extends OrdersRT {

  // 添加用户的属性 没有添加一个user对象进来 只是在Order中扩展了几个属性
  private String userName;
  private String sex;
  private String address;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
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

  @Override
  public String toString() {
    return "OrdersCustom [userName=" + userName + ", sex=" + sex + ", address=" + address + ", super.toString()="
        + super.toString() + "]";
  }
}