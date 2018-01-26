package com.ek.mybatis.day2.lazyloading;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ek.mybatis.day2.lazyloading.mapper.IOrderUserLazyLoading;
import com.ek.mybatis.day2.lazyloading.pojo.OrdersLazy;

public class MyTest {

  private static Logger logger = Logger.getLogger(MyTest.class);

  private SqlSessionFactory sqlSessionFactory;

  @Before
  public void setUp() throws Exception {
    InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
  }

  @Test
  public void testFindOrdersUserLazy() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    IOrderUserLazyLoading orderUserLazyLoading = sqlSession.getMapper(IOrderUserLazyLoading.class);
    List<OrdersLazy> orderList = orderUserLazyLoading.findOrdersUserLazy();
    for (OrdersLazy ordersLazy : orderList) {
      logger.debug(ordersLazy.getUsers());
    }
    sqlSession.close();
  }

}
