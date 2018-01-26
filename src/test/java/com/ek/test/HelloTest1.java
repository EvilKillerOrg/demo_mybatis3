package com.ek.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.ek.mybatis.day1.pojo.UserInfo;

/**
 * 第一个mybatis
 *
 */
public class HelloTest1 {

  private static Logger logger = Logger.getLogger(HelloTest1.class);
  
  /* 根据id查询用户信息,得到一条记录结果 */
  @Test
  public void testFindUserById() throws IOException{
    
    //配置文件
    String resource = "SqlMapConfig.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    
    //创建会话工厂,传入配置文件信息
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    
    //通过工厂得到SqlSession
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    //通过SqlSession操作数据库
    //参数1: 映射文件中statement的id, 值=namespace.statement的id
    //参数2: 与映射文件中配置的parameterType类型一致的参数
    UserInfo user = sqlSession.selectOne("test.findUserById", 1);
    logger.debug(user);

    //释放资源
    sqlSession.close();
  }
 
}