package com.ek.mybatis.day2.cache.level2.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * @author EK
 * @date 2017年8月24日
 */
public class UserInfoL2PO implements Serializable{
 
  private static final long serialVersionUID = 1L;
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