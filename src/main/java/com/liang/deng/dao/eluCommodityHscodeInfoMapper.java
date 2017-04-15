package com.liang.deng.dao;

import com.liang.deng.model.EluCommodityHscodeInfo;

public interface EluCommodityHscodeInfoMapper {
    int insert(EluCommodityHscodeInfo record);

    int insertSelective(EluCommodityHscodeInfo record);

    EluCommodityHscodeInfo selectByPrimaryKey(String hsCode);
}