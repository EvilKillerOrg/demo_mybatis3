package com.ek.mybatis.day1.pojo;

import java.util.Date;
/**
 * 这个类通常是orm逆向生成的,这个类一般不要动,需要扩展的话建一个子类(UserCustom)
 * @author EK
 * @date 2017年8月24日
 */
public class UserInfo {
  private Integer uuid;
  private String userName;
  private Date birthday;
  private String Sex;
  public Integer getUuid() {
    return uuid;
  }
  public void setUuid(Integer uuid) {
    this.uuid = uuid;
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
    return Sex;
  }
  public void setSex(String sex) {
    Sex = sex;
  }
  
  @Override
  public String toString() {
    return "UserInfo [uuid=" + uuid + ", userName=" + userName + ", birthday=" + birthday + ", Sex=" + Sex + "]\n";
  }
}