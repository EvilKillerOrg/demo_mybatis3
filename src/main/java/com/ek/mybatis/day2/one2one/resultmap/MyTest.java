package com.ek.mybatis.day2.one2one.resultmap;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ek.mybatis.day2.one2one.resultmap.mapper.IOrderUserMapper;
import com.ek.mybatis.day2.one2one.resultmap.pojo.OrdersRM;

public class MyTest {
  
  private Logger logger = Logger.getLogger(MyTest.class);
  
  private SqlSessionFactory sqlSessionFactory; 
  
  @Before
  public void setUp() throws Exception {
    InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
  }

  @Test
  public void testFindOrderUser() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    IOrderUserMapper ordersCustomRMMapper = sqlSession.getMapper(IOrderUserMapper.class);
    List<OrdersRM> orderList = ordersCustomRMMapper.findOrderUser();
    logger.debug(orderList);
    sqlSession.close();
  }

}
