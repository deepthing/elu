package com.liang.deng.dao;

import com.liang.deng.model.eluCommodityHscodeInfo;

public interface eluCommodityHscodeInfoMapper {
    int insert(eluCommodityHscodeInfo record);

    int insertSelective(eluCommodityHscodeInfo record);

    eluCommodityHscodeInfo selectByPrimaryKey(String hsCode);
}