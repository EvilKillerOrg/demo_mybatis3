package com.ek.mybatis.day1.pojo;

import java.util.List;

/**
 * 输入映射pojo包装类型
 * @author EK
 * @date 2017年8月24日
 */
public class UserQueryVO {
  
  //这里包装所需要的查询条件
  
  //传入多个uuid
  private List<Integer> uuids;
  
  
  //用户查询条件
  private UserCustom userCustom;

 
  
  //可以包装其他的查询条件 如:订单,商品等
  
  
  
  
  public UserCustom getUserCustom() {
    return userCustom;
  }

  public List<Integer> getUuids() {
    return uuids;
  }

  public void setUuids(List<Integer> uuids) {
    this.uuids = uuids;
  }

  public void setUserCustom(UserCustom userCustom) {
    this.userCustom = userCustom;
  }
}