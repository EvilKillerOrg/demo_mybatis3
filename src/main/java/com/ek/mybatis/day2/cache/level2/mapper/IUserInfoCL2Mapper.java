package com.ek.mybatis.day2.cache.level2.mapper;

import com.ek.mybatis.day2.cache.level2.pojo.UserInfoL2PO;

public interface IUserInfoCL2Mapper {

  UserInfoL2PO findUserById(Integer uuid) throws Exception;

}
