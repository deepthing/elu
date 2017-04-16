package com.liang.deng.dao;

import com.liang.deng.model.EluRoleRightInfo;

public interface EluRoleRightInfoMapper {
    int insert(EluRoleRightInfo record);

    int insertSelective(EluRoleRightInfo record);

    EluRoleRightInfo selectByPrimaryKey(Integer id);
}