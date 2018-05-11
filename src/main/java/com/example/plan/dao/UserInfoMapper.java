package com.example.plan.dao;

import com.example.plan.entity.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoMapper {
         UserInfo login(String username,String password);
         void add(UserInfo userInfo);
         UserInfo findOne(String username);
         void update(UserInfo userInfo);
}