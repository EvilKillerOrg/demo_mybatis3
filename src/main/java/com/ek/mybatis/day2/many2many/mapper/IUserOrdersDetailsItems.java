package com.ek.mybatis.day2.many2many.mapper;

import java.util.List;

import com.ek.mybatis.day2.many2many.pojo.UsersM2M;

public interface IUserOrdersDetailsItems {
  
  public abstract List<UsersM2M> findUserOrdersDetailsItems() throws Exception;

}
