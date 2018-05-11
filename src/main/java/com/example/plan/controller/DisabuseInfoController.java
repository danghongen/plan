package com.example.plan.controller;

import com.example.plan.entity.DisabuseInfo;
import com.example.plan.service.DisabuseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/question"})
public class DisabuseInfoController {
    @Autowired
    private DisabuseInfoService disabuseInfoService;
//查询所有问题及答案
    @RequestMapping("/disabuseList")
    public List<DisabuseInfo> AllDisabuse(){
        return this.disabuseInfoService.findallDisabuse();
    }
//查询所有问题
    @RequestMapping("/problemList")
    public List<DisabuseInfo> findAllProblem(){
        return this.disabuseInfoService.doFindAllProblem();
    }
//通过问题查询答案
    @RequestMapping("/findAnswer")
    public DisabuseInfo findAnswer(DisabuseInfo disabuseInfo,@RequestBody DisabuseInfo disabuseParam){
        String problem=disabuseParam.getProblem();
        disabuseParam.setProblem(problem);
        disabuseInfo.setProblem(problem);
      disabuseInfo=  this.disabuseInfoService.doFindAnswer(disabuseInfo);
        return disabuseInfo;

    }
}
