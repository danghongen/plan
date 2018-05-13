package com.example.plan.controller;

import com.example.plan.entity.DisabuseInfo;
import com.example.plan.service.DisabuseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/question"})
public class DisabuseInfoController {
    @Autowired
    private DisabuseInfoService disabuseInfoService;
//查询所有问题及答案
    @RequestMapping("/disabuseList")
    public Object allDisabuse(){
        return this.disabuseInfoService.findAllDisabuse();
    }
//查询所有问题
    @RequestMapping("/problemList")
    public Object findAllProblem(){
        return this.disabuseInfoService.doFindAllProblem();
    }
//通过问题查询答案
    @RequestMapping(value = "/findAnswer",method = RequestMethod.POST)
    public DisabuseInfo findAnswer( @RequestBody DisabuseInfo disabuseParam){
        DisabuseInfo disabuseInfo=new DisabuseInfo();
        String problem=disabuseParam.getProblem();
        disabuseInfo.setProblem(problem);
      disabuseInfo=  this.disabuseInfoService.doFindAnswer(disabuseInfo);
        return disabuseInfo;

    }

}
