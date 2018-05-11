package com.example.plan.dao;

import com.example.plan.entity.CustomerInfo;
import com.example.plan.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerInfoMapper {
    CustomerInfo add(CustomerInfo customerInfo);
    List<CustomerInfo> findCustomer();
    UserInfo findOne(String username);
}