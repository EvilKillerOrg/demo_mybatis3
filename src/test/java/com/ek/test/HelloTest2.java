package com.ek.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Test;

import com.ek.mybatis.day1.pojo.UserInfo;

public class HelloTest2 {
  private static Logger logger = Logger.getLogger(HelloTest1.class);

  private String resource = "SqlMapConfig.xml";
  private InputStream inputStream;
  private SqlSessionFactory sqlSessionFactory;
  private SqlSession sqlSession;

  {
    try {
      inputStream = Resources.getResourceAsStream(resource);
      sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
      sqlSession = sqlSessionFactory.openSession();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  
  
  /* 根据用户名查询 */
  @Test
  public void testFindUserByName() {
    // List<UserInfo> list = sqlSession.selectList("test.findUserByName","%e%"); //使用占位符
    List<UserInfo> list = sqlSession.selectList("test.findUserByName", "e"); // 不适用占位符
    logger.debug(list.size());
  }
  
  
  
  /* 新增用户 */
  @Test
  public void testInsertUser(){
    UserInfo user = new UserInfo();
    user.setUserName("haha");
    user.setBirthday(new Date());
    user.setSex("1");
    sqlSession.insert("test.insertUser", user);
    logger.debug(user.getUuid());
    sqlSession.commit();
  }
  
  
  
  /* 更新用户 */
  @Test
  public void testUpdateUser(){
    UserInfo user = new UserInfo();
    user.setUuid(7);
    user.setUserName("ekkk");
    user.setBirthday(new Date());
    user.setSex("1");
    sqlSession.update("test.updateUser", user);
    sqlSession.commit();
  }
  
  
  
  /* 删除用户 */
  @Test
  public void testDeleteUser(){
    sqlSession.delete("test.deleteUser", 8);
    sqlSession.commit();
  }
  
  
  
  @After
  public void closeSession(){
    sqlSession.close();
  }
}