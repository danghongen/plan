package com.example.plan.controller;

import com.example.plan.entity.UserInfo;
import com.example.plan.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/home"})
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
//注册
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@RequestBody UserInfo userParam) {
        UserInfo userInfo=new UserInfo();
        String username = userParam.getUsername();
        String usersexes = userParam.getUsersexes();
        String userages = userParam.getUserages();
        String password = userParam.getPassword();
         userInfo.setUsername(username);
         userInfo.setUsersexes(usersexes);
         userInfo.setUserages(userages);
         userInfo.setPassword(password);
       UserInfo user = userInfoService.doFindOne(username);
        String str = "";
        if (user == null) {
            userInfoService.doAdd(userInfo);
            str = "恭喜您，您已注册成功";
        } else {
            str="用户已存在，请登录或者更换用户名";
        }
        return str;
    }
//登陆
@RequestMapping(value = "/login",method = RequestMethod.POST)
public String login(UserInfo userInfo,@RequestBody UserInfo userParam ) {
    String username=userParam.getUsername();
    String password=userParam.getPassword();
    userInfo.setUsername(username);
    userInfo.setPassword(password);
   userInfo=this.userInfoService.doLogin(userInfo);
    String str="";
    if(userInfo!=null) {
        str="欢迎你！";
    }else {
        str="用户或密码错误！！！";
    }
    return str;
}
//修改用户信息
@RequestMapping(value = "/update",method = RequestMethod.POST)
    public String  updateUser(UserInfo userInfo,@RequestBody UserInfo userParam){
    String username = userParam.getUsername();
    String usersexes = userParam.getUsersexes();
    String userages = userParam.getUserages();
    String password = userParam.getPassword();
    String education=userParam.getEducation();
    String positions=userParam.getPositions();
    String company=userParam.getCompany();
    String honors=userParam.getHonors();
    String qualifies=userParam.getQualifies();
    String employmentTime=userParam.getEmploymentTime();
    String serviceQuantity=userParam.getServiceQuantity();
    String serviceType=userParam.getServiceType();
    userInfo.setUsername(username);
    userInfo.setUsersexes(usersexes);
    userInfo.setUserages(userages);
    userInfo.setPassword(password);
    userInfo.setEducation(education);
    userInfo.setPositions(positions);
    userInfo.setCompany(company);
    userInfo.setHonors(honors);
    userInfo.setQualifies(qualifies);
    userInfo.setEmploymentTime(employmentTime);
    userInfo.setServiceQuantity(serviceQuantity);
    userInfo.setServiceType(serviceType);
     this.userInfoService.doUpdate(userInfo);
    return "更新成功";
}

}
