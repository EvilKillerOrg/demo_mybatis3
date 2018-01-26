package com.ek.mybatis.day2.cache.level2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ek.mybatis.day2.cache.level2.mapper.IUserInfoCL2Mapper;
import com.ek.mybatis.day2.cache.level2.pojo.UserInfoL2PO;

public class MyTest {
  
   private static Logger logger = Logger.getLogger(MyTest.class);
   
   private SqlSessionFactory sqlSessionFactory;
  @Before
  public void setUp() throws Exception {
    InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
  }

  /* 一级缓存在一个SqlSession中 二级缓存是跨SqlSession 在一个mapper中的 */
  @Test
  public void testFindUserById() throws Exception {
    // 要测试二级缓存 需要用多个SqlSession
    SqlSession sqlSession1 = sqlSessionFactory.openSession();
    SqlSession sqlSession2 = sqlSessionFactory.openSession();
    SqlSession sqlSession3 = sqlSessionFactory.openSession();
    IUserInfoCL2Mapper userInfoMapper1 = sqlSession1.getMapper(IUserInfoCL2Mapper.class);
    IUserInfoCL2Mapper userInfoMapper2 = sqlSession2.getMapper(IUserInfoCL2Mapper.class);
    IUserInfoCL2Mapper userInfoMapper3 = sqlSession3.getMapper(IUserInfoCL2Mapper.class);
    
    //第一次发起请求
    UserInfoL2PO userInfo1 = userInfoMapper1.findUserById(1);
    logger.debug(userInfo1);
    sqlSession1.close(); //这里要是不关闭,数据就写不到二级缓存区域中
    
    //第二次发起请求
    UserInfoL2PO userInfo2 = userInfoMapper2.findUserById(1);
    logger.debug(userInfo2);
    //sqlSession2.commit(犯懒没写新增修改等操作); //在这里提交 会清空本mapper的二级缓存()
    sqlSession2.close();
    
    
    //第三次发起请求
    UserInfoL2PO userInfo3 = userInfoMapper3.findUserById(1);
    logger.debug(userInfo3);
    sqlSession3.close();
  }

}