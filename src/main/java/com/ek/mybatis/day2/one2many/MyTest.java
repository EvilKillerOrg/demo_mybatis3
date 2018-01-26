package com.ek.mybatis.day2.one2many;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ek.mybatis.day2.one2many.mapper.IOrderUserDetails;
import com.ek.mybatis.day2.one2many.pojo.OrdersO2M;

public class MyTest {

  private Logger logger = Logger.getLogger(MyTest.class);

  private SqlSessionFactory sqlSessionFactory;

  @Before
  public void setUp() throws Exception {
    InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

  }

  @Test
  public void testFindOrderUserDetails() {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    IOrderUserDetails orderUserDetails = sqlSession.getMapper(IOrderUserDetails.class);
    List<OrdersO2M> ordersList = orderUserDetails.findOrderUserDetails();
    logger.debug(ordersList);
    sqlSession.close();
  }

}