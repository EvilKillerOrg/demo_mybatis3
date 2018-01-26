package com.ek.mybatis.day2.many2many;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ek.mybatis.day2.many2many.mapper.IUserOrdersDetailsItems;
import com.ek.mybatis.day2.many2many.pojo.UsersM2M;

public class MyTest {
  
  private static Logger logger = Logger.getLogger(MyTest.class);
  
  private SqlSessionFactory sqlSessionFactory;
  
  @Before
  public void setUp() throws Exception {
    InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
  }

  @Test
  public void testFindUserOrdersDetailsItems() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    IUserOrdersDetailsItems userOrdersDetailsItems = sqlSession.getMapper(IUserOrdersDetailsItems.class);
    List<UsersM2M> userList =  userOrdersDetailsItems.findUserOrdersDetailsItems();
    logger.debug(userList);
    sqlSession.close();
  }

}
