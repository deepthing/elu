package com.liang.deng.dao;

import com.liang.deng.model.eluCommodityBl;
import com.liang.deng.model.eluCommodityBlKey;

public interface eluCommodityBlMapper {
    int insert(eluCommodityBl record);

    int insertSelective(eluCommodityBl record);

    eluCommodityBl selectByPrimaryKey(eluCommodityBlKey key);
}