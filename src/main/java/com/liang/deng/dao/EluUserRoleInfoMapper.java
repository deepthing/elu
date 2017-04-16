package com.liang.deng.dao;

import com.liang.deng.model.EluUserRoleInfo;

public interface EluUserRoleInfoMapper {
    int insert(EluUserRoleInfo record);

    int insertSelective(EluUserRoleInfo record);

    EluUserRoleInfo selectByPrimaryKey(Integer id);
}