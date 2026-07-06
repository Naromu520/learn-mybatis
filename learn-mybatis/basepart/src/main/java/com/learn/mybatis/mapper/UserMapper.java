package com.learn.mybatis.mapper;

import com.learn.mybatis.pojo.User;

public interface UserMapper {
    int insertUser();
    int deleteUser();
    int updateUser();
    User getUser();
}
