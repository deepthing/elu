package com.liang.deng.dao;

import com.liang.deng.model.EluRoutePrice;
import com.liang.deng.model.EluRoutePriceKey;

public interface EluRoutePriceMapper {
    int insert(EluRoutePrice record);

    int insertSelective(EluRoutePrice record);

    EluRoutePrice selectByPrimaryKey(EluRoutePriceKey key);
}