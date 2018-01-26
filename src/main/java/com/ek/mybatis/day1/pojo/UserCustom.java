package com.ek.mybatis.day1.pojo;

/**
 * 用户(UserInfo)的扩展类 来扩展用户的信息
 * @author EK
 * @date 2017年8月24日
 */
public class UserCustom extends UserInfo {
  
  private Integer age; //扩展的属性

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "UserCustom [" + super.toString() + "]";
  }
}