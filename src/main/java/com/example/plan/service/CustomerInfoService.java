package com.example.plan.service;

import com.example.plan.dao.CustomerInfoMapper;
import com.example.plan.entity.CustomerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerInfoService {
    @Autowired
    private CustomerInfoMapper customerInfoMapper;
//添加客户
    public void addCustomers(CustomerInfo customerInfo){
  customerInfoMapper.add(customerInfo);
    }
//查询所有客户
    public List<CustomerInfo> allCustomers(){
    return customerInfoMapper.findCustomer();
    }

}
