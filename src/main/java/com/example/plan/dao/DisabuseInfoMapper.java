package com.example.plan.dao;

import com.example.plan.entity.DisabuseInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisabuseInfoMapper {
   List<DisabuseInfo> allDisabuse();
    List<DisabuseInfo> findAllProblem();
   DisabuseInfo findAllAnswer(DisabuseInfo disabuseInfo);
   DisabuseInfo findAnswer(DisabuseInfo disabuseInfo);
}