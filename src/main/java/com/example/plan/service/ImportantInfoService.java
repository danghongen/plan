package com.example.plan.service;

import com.example.plan.dao.ImportantInfoMapper;
import com.example.plan.entity.ImportantInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImportantInfoService {
    @Autowired
    private ImportantInfoMapper importantInfoMapper;

public List<ImportantInfo> findImportantCustomer(){
  return  this.importantInfoMapper.allImport();

}
}
