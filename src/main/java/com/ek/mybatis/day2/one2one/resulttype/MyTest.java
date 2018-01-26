package com.ek.mybatis.day2.one2one.resulttype;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ek.mybatis.day2.one2one.resulttype.mapper.IOrderCustomMapper;
import com.ek.mybatis.day2.one2one.resulttype.pojo.OrdersCustomRT;

public class MyTest {
  
  private static Logger logger = Logger.getLogger(MyTest.class);
  
  private SqlSessionFactory sqlSessionFactory;
  
  @Before
  public void setUp() throws Exception {
    InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    
  }

  @Test
  public void testFindOrderCustom() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    IOrderCustomMapper ordersCustomMapper = sqlSession.getMapper(IOrderCustomMapper.class);
    List<OrdersCustomRT> ordersCustomList = ordersCustomMapper.findOrderCustom();
    logger.debug(ordersCustomList);
    sqlSession.close();
  }

}
