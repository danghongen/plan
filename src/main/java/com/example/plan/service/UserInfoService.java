package com.example.plan.service;

import com.example.plan.dao.UserInfoMapper;
import com.example.plan.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo doLogin(UserInfo userInfo) {
            userInfo=this.userInfoMapper.login(userInfo.getUsername(),userInfo.getPassword());
            return userInfo;
    }

    public UserInfo doFindOne(String username){
      UserInfo userInfo=this.userInfoMapper.findOne(username);
        return userInfo;
    }

    public void doAdd(UserInfo userInfo){
      this.userInfoMapper.add(userInfo);
    }

    public void doUpdate(UserInfo userInfo){
       this.userInfoMapper.update(userInfo);
    }
}
