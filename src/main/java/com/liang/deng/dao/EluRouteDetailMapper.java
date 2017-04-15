package com.liang.deng.dao;

import com.liang.deng.model.EluRouteDetail;
import com.liang.deng.model.EluRouteDetailKey;

public interface EluRouteDetailMapper {
    int insert(EluRouteDetail record);

    int insertSelective(EluRouteDetail record);

    EluRouteDetail selectByPrimaryKey(EluRouteDetailKey key);
}