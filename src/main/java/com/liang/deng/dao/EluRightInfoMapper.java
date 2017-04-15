package com.liang.deng.dao;

import com.liang.deng.model.EluRightInfo;

public interface EluRightInfoMapper {
    int insert(EluRightInfo record);

    int insertSelective(EluRightInfo record);

    EluRightInfo selectByPrimaryKey(Integer rightCode);
}