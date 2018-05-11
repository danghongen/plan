package com.example.plan.dao;

import com.example.plan.entity.ImportantInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImportantInfoMapper {
    List<ImportantInfo> allImport();
}