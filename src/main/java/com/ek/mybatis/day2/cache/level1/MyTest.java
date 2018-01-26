package com.ek.mybatis.day2.cache.level1;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ek.mybatis.day2.cache.level1.mapper.IUserInfoCL1Mapper;
import com.ek.mybatis.day2.cache.level1.pojo.UserInfoL1PO;

public class MyTest {

  private static Logger logger = Logger.getLogger(MyTest.class);
  
  private SqlSessionFactory sqlSessionFactory;
  
  @Before
  public void setUp() throws Exception {
    InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
  }

  
  /* SqlSession就是mybatis的一级缓存 每个SqlSession之间是相互隔离的 */
  @Test
  public void testFindUserById() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    IUserInfoCL1Mapper userInfoMapper = sqlSession.getMapper(IUserInfoCL1Mapper.class);
    
    // 下边查询两次 使用的是一个sqlSession 
    
    //第一次查询
    UserInfoL1PO userInfo1 = userInfoMapper.findUserById(1);
    logger.debug(userInfo1);
    //sqlSession.commit(犯懒没写新增修改等操作);
    
    //第二次查询 (第二次是不发出sql的 如果执行第一次后使用了commit的话 这个sqlSession一级缓存会清空 第二次查询会再次产生sql(避免脏读))
    UserInfoL1PO userInfo2 = userInfoMapper.findUserById(1);
    logger.debug(userInfo2);
    
    sqlSession.close();
  }

}