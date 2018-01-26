package com.ek.mybatis.day1.mapper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ek.mybatis.day1.pojo.UserCustom;
import com.ek.mybatis.day1.pojo.UserInfo;
import com.ek.mybatis.day1.pojo.UserQueryVO;

public class UserInfoMapperTest {
  private Logger logger = Logger.getLogger(UserInfoMapperTest.class);
  
  private SqlSessionFactory sqlSessionFactory;
  @Before
  public void setUp() throws Exception {
    InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml"); 
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
  }


  
  @Test
  public void testFindUserById() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    //mybatis自动生成mapper代理对象
    IUserInfoMapper userMapper = sqlSession.getMapper(IUserInfoMapper.class);
    UserInfo userInfo = userMapper.findUserById(1);
    logger.debug(userInfo);
    sqlSession.close();
  }
  
  
  @Test
  public void testFindUserByName() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    IUserInfoMapper userMapper = sqlSession.getMapper(IUserInfoMapper.class);
    List<UserInfo> userList = userMapper.findUserByName("%e%");
    logger.debug(userList);
    sqlSession.close();
  }
  
  
  /* 测综合查询 */
  @Test
  public void testFindUserList() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    IUserInfoMapper userMapper = sqlSession.getMapper(IUserInfoMapper.class);
    
    // 创建包装对象,设置查询条件
    UserQueryVO userQueryVO = new UserQueryVO();
    UserCustom userCustom = new UserCustom();
    userCustom.setSex("1");
    userCustom.setUserName("%e%");
    userQueryVO.setUserCustom(userCustom);
    
    List<UserCustom> userList = userMapper.findUserList(userQueryVO);
    logger.debug(userList);
    sqlSession.close();
  }
  
  
  
  /* 综合查询总记录数 */
  @Test
  public void testFindUserCount() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    IUserInfoMapper userMapper = sqlSession.getMapper(IUserInfoMapper.class);
    
    // 创建包装对象,设置查询条件
    UserQueryVO userQueryVO = new UserQueryVO();
    UserCustom userCustom = new UserCustom();
    userCustom.setSex("1");
    userCustom.setUserName("%e%");  
    userQueryVO.setUserCustom(userCustom);
    
    int userCount = userMapper.findUserCount(userQueryVO);
    logger.debug(userCount);
    sqlSession.close();
  }
  
  
  
  /* 测试使用resultMap */
  @Test
  public void testFindUserInResultMap() throws Exception{
    SqlSession sqlSession = sqlSessionFactory.openSession();
    IUserInfoMapper userMapper = sqlSession.getMapper(IUserInfoMapper.class);
    List<UserInfo> userList = userMapper.findUserInResultMap();
    logger.debug(userList);
  }
  
  
  
  /* 测试动态sql */
  @Test
  public void testFindUserListDynamicSql() throws Exception{
    SqlSession sqlSession = sqlSessionFactory.openSession();
    IUserInfoMapper userMapper = sqlSession.getMapper(IUserInfoMapper.class);
    UserQueryVO userQueryVO = new UserQueryVO();
    UserCustom userCustom = new UserCustom();
    userCustom.setSex("1");
    userCustom.setUserName("%e%");
    userQueryVO.setUserCustom(userCustom);
    
    List<UserCustom> customList = userMapper.findUserListDynamicSql(userQueryVO);
    logger.debug(customList);
    sqlSession.close();
  }
  
  

  /* 测试sql片段 */
  @Test
  public void testFindUserCountSqlpd() throws Exception{
    SqlSession sqlSession = sqlSessionFactory.openSession();
    IUserInfoMapper userMapper = sqlSession.getMapper(IUserInfoMapper.class);
    UserQueryVO userQueryVO = new UserQueryVO();
    UserCustom userCustom = new UserCustom();
    userCustom.setSex("1");
    userCustom.setUserName("%e%");
    userQueryVO.setUserCustom(userCustom);
    
    int count = userMapper.findUserCountSqlpd(userQueryVO);
    logger.debug(count);
    sqlSession.close();
  }
  
  
  
  /* 测试sql片段+foreach (只在这里对user_name和userName做了resultMap映射 查出来是有值的, 前面有些涉及到用户名的地方没有做resultMap映射)*/
  @Test
  public void testFindUserForeach() throws Exception{
    SqlSession sqlSession = sqlSessionFactory.openSession();
    IUserInfoMapper userMapper = sqlSession.getMapper(IUserInfoMapper.class);
    UserQueryVO userQueryVO = new UserQueryVO();
    UserCustom userCustom = new UserCustom();
    userCustom.setUserName("%e%");
    //传入多个id
    List<Integer> uuids = new ArrayList<Integer>();
    uuids.add(1);
    uuids.add(2);
    uuids.add(3);
    userQueryVO.setUuids(uuids);
    userQueryVO.setUserCustom(userCustom);
    
    List<UserCustom> customList = userMapper.findUserForeach(userQueryVO);
    logger.debug(customList);
    sqlSession.close();
  }
}