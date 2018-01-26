package com.ek.mybatis.day2.cache.level1.mapper;

import com.ek.mybatis.day2.cache.level1.pojo.UserInfoL1PO;

public interface IUserInfoCL1Mapper {
  UserInfoL1PO findUserById(Integer id) throws Exception;
}
