package com.liang.deng.dao;

import com.liang.deng.model.EluCommodityBl;
import com.liang.deng.model.EluCommodityBlKey;

public interface EluCommodityBlMapper {
    int insert(EluCommodityBl record);

    int insertSelective(EluCommodityBl record);

    EluCommodityBl selectByPrimaryKey(EluCommodityBlKey key);
}