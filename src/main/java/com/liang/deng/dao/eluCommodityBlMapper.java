package com.liang.deng.dao;

import com.liang.deng.model.EluCommodityBl;

public interface EluCommodityBlMapper {
    int insert(EluCommodityBl record);

    int insertSelective(EluCommodityBl record);

    EluCommodityBl selectByPrimaryKey(Integer routeCode);
}