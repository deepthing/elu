package com.liang.deng.dao;

import com.liang.deng.model.EluRightModuleInfo;

public interface EluRightModuleInfoMapper {
    int insert(EluRightModuleInfo record);

    int insertSelective(EluRightModuleInfo record);

    EluRightModuleInfo selectByPrimaryKey(Integer sNo);
}