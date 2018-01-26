package com.ek.mybatis.day1.dao;
/**
 * dao方式开发 自己写实现类
 */
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ek.mybatis.day1.pojo.UserInfo;

public class UserInfoDAOImpl implements IUserInfoDAO{

  //需要向dao注入 SqlSessionFactory
  //这里用构造器注入 SqlSessionFactory
  private SqlSessionFactory sqlSessionFactory;
  public UserInfoDAOImpl(SqlSessionFactory sqlSessionFactory){
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
   
  @Override
  public UserInfo findUserInfoById(Integer uuid) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    UserInfo user = sqlSession.selectOne("test.findUserById", uuid);
    sqlSession.close();//现在是原生态的这里需要释放资源
    return user;
  }

  
  
  @Override
  public void insertUserInfo(UserInfo userInfo) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    sqlSession.insert("test.insertUser", userInfo);
    sqlSession.commit();//新增修改删除时要提交
    sqlSession.close();
  }

  
  
  @Override
  public void deleteUserInfo(Integer uuid) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    sqlSession.delete("test.deleteUser", uuid);
    sqlSession.commit();//新增修改删除时要提交
    sqlSession.close();
  }
}