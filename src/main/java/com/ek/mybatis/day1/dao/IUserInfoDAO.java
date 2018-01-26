package com.ek.mybatis.day1.dao;

import com.ek.mybatis.day1.pojo.UserInfo;

/**
 * dao接口 
 *
 */
public interface IUserInfoDAO {
  
  /* 根据id查询用户信息 */
  public UserInfo findUserInfoById(Integer uuid) throws Exception;

  /* 添加用户信息 */
  public void insertUserInfo(UserInfo userInfo) throws Exception;
  
  /* 删除用户信息 */
  public void deleteUserInfo(Integer uuid) throws Exception;
}