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
    public String addCustomer(CustomerInfo customerInfo,@RequestBody CustomerInfo customerParam){
        String username=customerParam.getUsername();
        String usersexes=customerParam.getUsersexes();
        String userages=customerParam.getUserages();
        String education=customerParam.getEducation();
        String positions=customerParam.getPositions();
        String company=customerParam.getCompany();
        String income=customerParam.getIncome();
        String spouseIncome=customerParam.getSpouse_income();
        String familyAssets=customerParam.getFamily_assets();
        String hoseProperty=customerParam.getHose_property();
        Integer numberCars=customerParam.getNumber_cars();
        String carBrand=customerParam.getCar_brand();
        String currents=customerParam.getCurrents();
        String regular=customerParam.getRegular();
        String financing=customerParam.getFinancing();
        String shares=customerParam.getShares();
        String loan=customerParam.getLoan();
        String heartDisease=customerParam.getHeart_disease();
        String typeInvestment=customerParam.getType_investment();
        String carerSpouses=customerParam.getCarer_spouses();
        String familyPillar=customerParam.getFamily_pillar();
        String power=customerParam.getPower();
        Integer numberSons=customerParam.getNumber_sons();
       Integer numberDaughter=customerParam.getNumber_daughter();
        String whetherBought=customerParam.getWhether_bought();
        String purposeInsurance=customerParam.getPurpose_insurance();
        String precast=customerParam.getPrecast();
        String recentlySpend=customerParam.getRecently_spend();
        String enterpriseAssets=customerParam.getEnterprise_assets();
        customerInfo.setUsername(username);
        customerInfo.setUsersexes(usersexes);
        customerInfo.setUserages(userages);
        customerInfo.setEducation(education);
        customerInfo.setPositions(positions);
        customerInfo.setCompany(company);
        customerInfo.setIncome(income);
        customerInfo.setSpouse_income(spouseIncome);
        customerInfo.setFamily_assets(familyAssets);
        customerInfo.setHose_property(hoseProperty);
        customerInfo.setNumber_cars(numberCars);
        customerInfo.setCar_brand(carBrand);
        customerInfo.setCurrents(currents);
        customerInfo.setRegular(regular);
        customerInfo.setFinancing(financing);
        customerInfo.setShares(shares);
        customerInfo.setLoan(loan);
        customerInfo.setHeart_disease(heartDisease);
        customerInfo.setType_investment(typeInvestment);
        customerInfo.setCarer_spouses(carerSpouses);
        customerInfo.setFamily_pillar(familyPillar);
        customerInfo.setPower(power);
        customerInfo.setNumber_sons(numberSons);
        customerInfo.setNumber_daughter(numberDaughter);
        customerInfo.setWhether_bought(whetherBought);
        customerInfo.setPurpose_insurance(purposeInsurance);
        customerInfo.setPrecast(precast);
        customerInfo.setRecently_spend(recentlySpend);
        customerInfo.setEnterprise_assets(enterpriseAssets);

         this.customerInfoService.addCustomers(customerInfo);

         return "客户添加成功";

    }

}
