package com.liang.deng.dao;

import com.liang.deng.model.EluModuleInfo;

public interface EluModuleInfoMapper {
    int insert(EluModuleInfo record);

    int insertSelective(EluModuleInfo record);

    EluModuleInfo selectByPrimaryKey(Integer moduleCode);
}