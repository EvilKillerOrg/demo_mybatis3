package com.ek.mybatis.day1.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ek.mybatis.day1.pojo.UserInfo;

public class UserInfoDAOTest {
  private Logger logger = Logger.getLogger(UserInfoDAOTest.class);

  private SqlSessionFactory sqlSessionFactory;
  
  @Before
  public void setUp() throws Exception {
    InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
  }

  @Test
  public void testFindUserInfoById() throws Exception {
    IUserInfoDAO userDAO = new UserInfoDAOImpl(sqlSessionFactory);
    UserInfo user = userDAO.findUserInfoById(1);
    logger.debug(user);
  }

}