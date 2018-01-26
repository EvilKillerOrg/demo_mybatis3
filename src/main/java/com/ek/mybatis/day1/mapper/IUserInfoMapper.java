package com.ek.mybatis.day1.mapper;

import java.util.List;

import com.ek.mybatis.day1.pojo.UserCustom;
import com.ek.mybatis.day1.pojo.UserInfo;
import com.ek.mybatis.day1.pojo.UserQueryVO;

/**
 * mapper代理方式开发
 * mapper接口 相当于dao接口 
 * 1. 在mapper.xml中 namespace等于mapper接口的地址(全限定名)
 * 2. mapper接口中的方法名要和mapper.xml 中的statement的id一致
 * 3. mapper接口中的方法输入参数类型要和mapper.xml 中statement的parameterType指定的类型一致
 * 4. mapper接口中的返回值的类型要和mapper.xml 中statement的resultType指定的类型一致
 */

public interface IUserInfoMapper {
  
  /* 根据id查询用户信息 */
  public UserInfo findUserById(int uuid) throws Exception;
  
  /* 根据姓名查询用户信息 */
  public List<UserInfo> findUserByName(String username) throws Exception;

  /* 添加用户信息 */
  public void insertUser(UserInfo userInfo) throws Exception;
  
  /* 修改 */
  public void updateUser(UserInfo userInfo) throws Exception;
  
  /* 删除 */
  public void deleteUser(Integer uuid) throws Exception;
  
  /* 综合查询 */
  public List<UserCustom> findUserList(UserQueryVO userQureyVO) throws Exception;
  
  /* 综合查询总记录数 */
  public int findUserCount(UserQueryVO userQureyVO) throws Exception;
  
  /* 测试使用resultMap */
  public List<UserInfo> findUserInResultMap() throws Exception;
  
  /* 测试动态sql */
  public List<UserCustom> findUserListDynamicSql(UserQueryVO userQureyVO) throws Exception;
  
  /* 测试sql片段 */
  public int findUserCountSqlpd(UserQueryVO userQueryVO) throws Exception;
  
  /* 测试sql片段+foreach */
  public List<UserCustom> findUserForeach(UserQueryVO userQueryVO) throws Exception;
  
}