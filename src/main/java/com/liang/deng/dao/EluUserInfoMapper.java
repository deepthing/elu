package com.liang.deng.dao;

import com.liang.deng.model.EluUserInfo;

public interface EluUserInfoMapper {
    int insert(EluUserInfo record);

    int insertSelective(EluUserInfo record);

    EluUserInfo selectByPrimaryKey(Integer userCode);
}