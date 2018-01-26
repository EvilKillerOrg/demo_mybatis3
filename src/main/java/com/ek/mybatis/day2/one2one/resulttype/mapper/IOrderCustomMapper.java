package com.ek.mybatis.day2.one2one.resulttype.mapper;

import java.util.List;

import com.ek.mybatis.day2.one2one.resulttype.pojo.OrdersCustomRT;

public interface IOrderCustomMapper {
  
  // 查询订单关联用户信息 订单到用户是一对一
  public abstract List<OrdersCustomRT> findOrderCustom() throws Exception;

}