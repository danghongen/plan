package com.example.plan.controller;

import com.example.plan.service.ImportantInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/important"})
public class ImportantInfoController {
    @Autowired
    private ImportantInfoService importantInfoService;
//查询所有重要客户
@RequestMapping("/importantList")
public Object findAllCustomer(){
    return this.importantInfoService.findImportantCustomer();
}


}
