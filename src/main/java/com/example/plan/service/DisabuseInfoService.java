package com.example.plan.service;

import com.example.plan.dao.DisabuseInfoMapper;
import com.example.plan.entity.DisabuseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisabuseInfoService {
    @Autowired
    private DisabuseInfoMapper disabuseInfoMapper;

    public List<DisabuseInfo> findAllDisabuse(){
   return this.disabuseInfoMapper.allDisabuse();

    }

   public List<DisabuseInfo> doFindAllProblem(){
       return  this.disabuseInfoMapper.findAllProblem();

   }

    public DisabuseInfo doFindAnswer( DisabuseInfo disabuseInfo){
        disabuseInfo=this.disabuseInfoMapper.findAnswer(disabuseInfo);
        return disabuseInfo;

    }
}
