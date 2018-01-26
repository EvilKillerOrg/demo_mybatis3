package com.ek.mybatis.day2.one2one.resultmap.mapper;

import java.util.List;

import com.ek.mybatis.day2.one2one.resultmap.pojo.OrdersRM;

public interface IOrderUserMapper {

  // 查询订单关联用户信息 订单到用户是一对一
  public List<OrdersRM> findOrderUser() throws Exception;

}