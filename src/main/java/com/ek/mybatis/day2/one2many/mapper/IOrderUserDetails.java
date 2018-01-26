package com.ek.mybatis.day2.one2many.mapper;

import java.util.List;

import com.ek.mybatis.day2.one2many.pojo.OrdersO2M;

public interface IOrderUserDetails {
  
  // 主要测试订单对订单明细的一对多
  public abstract List<OrdersO2M> findOrderUserDetails();

}