package com.ek.mybatis.day2.lazyloading.mapper;

import java.util.List;

import com.ek.mybatis.day2.lazyloading.pojo.OrdersLazy;
import com.ek.mybatis.day2.lazyloading.pojo.UsersLazy;

/**
 * 延时加载需要配置SqlMapConfig.xml 中的
 * <setting name="lazyLoadingEnabled" value="true"/> 和
 * <setting name="aggressiveLazyLoading" value="false"/>
 * @author EK
 * @date 2017年8月27日
 */
public interface IOrderUserLazyLoading {
  
  public abstract UsersLazy findUserById(Integer id) throws Exception; 
  
  public abstract List<OrdersLazy> findOrdersUserLazy() throws Exception;
 

}