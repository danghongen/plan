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
    public CustomerInfo addCustomer(CustomerInfo customerInfo,@RequestBody CustomerInfo customerParam){
        String username=customerParam.getUsername();
        String usersexes=customerParam.getUsersexes();
        String userages=customerParam.getUserages();
        String education=customerParam.getEducation();
        String positions=customerParam.getPositions();
        String company=customerParam.getCompany();
        String myIncome=customerParam.getMyIncome();
        String spouseIncome=customerParam.getSpouseIncome();
        String familyAssets=customerParam.getFamilyAssets();
        String hoseProperty=customerParam.getHoseProperty();
        Integer numberCars=customerParam.getNumberCars();
        String carBrand=customerParam.getCarBrand();
        String currents=customerParam.getCurrents();
        String regular=customerParam.getRegular();
        String financing=customerParam.getFinancing();
        String shares=customerParam.getShares();
        String loan=customerParam.getLoan();
        String heartDisease=customerParam.getHeartDisease();
        String typeInvestment=customerParam.getTypeInvestment();
        String carerSpouses=customerParam.getCarerSpouses();
        String familyPillar=customerParam.getFamilyPillar();
        String power=customerParam.getPower();
        Integer numberSons=customerParam.getNumberSons();
       Integer numberDaughter=customerParam.getNumberDaughter();
        String whetherBought=customerParam.getWhetherBought();
        String purposeInsurance=customerParam.getPurposeInsurance();
        String precast=customerParam.getPrecast();
        String recentlySpend=customerParam.getRecentlySpend();
        String enterpriseAssets=customerParam.getEnterpriseAssets();
        customerInfo.setUsername(username);
        customerInfo.setUsersexes(usersexes);
        customerInfo.setUserages(userages);
        customerInfo.setEducation(education);
        customerInfo.setPositions(positions);
        customerInfo.setCompany(company);
        customerInfo.setMyIncome(myIncome);
        customerInfo.setSpouseIncome(spouseIncome);
        customerInfo.setFamilyAssets(familyAssets);
        customerInfo.setHoseProperty(hoseProperty);
        customerInfo.setNumberCars(numberCars);
        customerInfo.setCarBrand(carBrand);
        customerInfo.setCurrents(currents);
        customerInfo.setRegular(regular);
        customerInfo.setFinancing(financing);
        customerInfo.setShares(shares);
        customerInfo.setLoan(loan);
        customerInfo.setHeartDisease(heartDisease);
        customerInfo.setTypeInvestment(typeInvestment);
        customerInfo.setCarerSpouses(carerSpouses);
        customerInfo.setFamilyPillar(familyPillar);
        customerInfo.setPower(power);
        customerInfo.setNumberSons(numberSons);
        customerInfo.setNumberDaughter(numberDaughter);
        customerInfo.setWhetherBought(whetherBought);
        customerInfo.setPurposeInsurance(purposeInsurance);
        customerInfo.setPrecast(precast);
        customerInfo.setRecentlySpend(recentlySpend);
        customerInfo.setEnterpriseAssets(enterpriseAssets);

         customerInfo=customerInfoService.addCustomers(customerInfo);

         return customerInfo;

    }

}
