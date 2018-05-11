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

    public CustomerInfo addCustomers(CustomerInfo customerInfo){
    customerInfo=customerInfoMapper.add(customerInfo);
      return customerInfo;
    }

    public List<CustomerInfo> allCustomers(){
    return customerInfoMapper.findCustomer();
    }

}
