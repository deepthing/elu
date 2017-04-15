package com.liang.deng.dao;

import com.liang.deng.model.EluRoleInfo;

public interface EluRoleInfoMapper {
    int insert(EluRoleInfo record);

    int insertSelective(EluRoleInfo record);

    EluRoleInfo selectByPrimaryKey(Integer roleCode);
}