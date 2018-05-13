package com.example.plan.controller;

import com.example.plan.entity.CustomerInfo;
import com.example.plan.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/customer"})
public class CustomerInfoController {
    @Autowired
    private CustomerInfoService customerInfoService;
//查询所有客户
    @RequestMapping("/customerList")
    public Object findAllCustomer(){
        return this.customerInfoService.allCustomers();
    }
//添加客户
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addCustomer(@RequestBody CustomerInfo customerParam){
        CustomerInfo customerInfo=new CustomerInfo();
        customerInfo.setUsername(customerParam.getUsername());
        customerInfo.setUsersexes(customerParam.getUsersexes());
        customerInfo.setUserages(customerParam.getUserages());
        customerInfo.setEducation(customerParam.getEducation());
        customerInfo.setPositions(customerParam.getPositions());
        customerInfo.setCompany(customerParam.getCompany());
        customerInfo.setIncome(customerParam.getIncome());
        customerInfo.setSpouse_income(customerParam.getSpouse_income());
        customerInfo.setFamily_assets(customerParam.getFamily_assets());
        customerInfo.setHose_property(customerParam.getHose_property());
        customerInfo.setNumber_cars(customerParam.getNumber_cars());
        customerInfo.setCar_brand(customerParam.getCar_brand());
        customerInfo.setCurrents(customerParam.getCurrents());
        customerInfo.setRegular(customerParam.getRegular());
        customerInfo.setFinancing(customerParam.getFinancing());
        customerInfo.setShares(customerParam.getShares());
        customerInfo.setLoan(customerParam.getLoan());
        customerInfo.setHeart_disease(customerParam.getHeart_disease());
        customerInfo.setType_investment(customerParam.getType_investment());
        customerInfo.setCarer_spouses(customerParam.getCarer_spouses());
        customerInfo.setFamily_pillar(customerParam.getFamily_pillar());
        customerInfo.setPower(customerParam.getPower());
        customerInfo.setNumber_sons(customerParam.getNumber_sons());
        customerInfo.setNumber_daughter(customerParam.getNumber_daughter());
        customerInfo.setWhether_bought(customerParam.getWhether_bought());
        customerInfo.setPurpose_insurance(customerParam.getPurpose_insurance());
        customerInfo.setPrecast(customerParam.getPrecast());
        customerInfo.setRecently_spend(customerParam.getRecently_spend());
        customerInfo.setEnterprise_assets(customerParam.getEnterprise_assets());

         this.customerInfoService.addCustomers(customerInfo);

         return "客户添加成功";

    }

}
