package com.liang.deng.dao;

import com.liang.deng.model.EluCommodityWl;

public interface EluCommodityWlMapper {
    int insert(EluCommodityWl record);

    int insertSelective(EluCommodityWl record);

    EluCommodityWl selectByPrimaryKey(Integer routeCode);
}