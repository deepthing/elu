package com.liang.deng.dao;

import com.liang.deng.model.EluRouteDetail;

public interface EluRouteDetailMapper {
    int insert(EluRouteDetail record);

    int insertSelective(EluRouteDetail record);

    EluRouteDetail selectByPrimaryKey(Integer routeCode);
}