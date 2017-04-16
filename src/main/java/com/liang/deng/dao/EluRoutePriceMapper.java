package com.liang.deng.dao;

import com.liang.deng.model.EluRoutePrice;

public interface EluRoutePriceMapper {
    int insert(EluRoutePrice record);

    int insertSelective(EluRoutePrice record);

    EluRoutePrice selectByPrimaryKey(Integer id);
}