package com.liang.deng.dao;

import com.liang.deng.model.EluCommodityWl;
import com.liang.deng.model.EluCommodityWlKey;

public interface EluCommodityWlMapper {
    int insert(EluCommodityWl record);

    int insertSelective(EluCommodityWl record);

    EluCommodityWl selectByPrimaryKey(EluCommodityWlKey key);
}