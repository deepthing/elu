package com.liang.deng.service.CalRoute;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liang.deng.dao.EluRouteDetailMapper;
import com.liang.deng.dao.EluRoutePriceMapper;
import com.liang.deng.model.EluRouteDetail;
@Service
public class FuzzySyntheticEvaluation {
	
	@Resource
	EluRouteDetailMapper routeDetailDao;
	@Resource
	EluRoutePriceMapper routePrice;
	
	public EluRouteDetail getResoure(int id){
		EluRouteDetail routeDetail = routeDetailDao.selectByPrimaryKey(id);
		return routeDetail;
	}
	
	
}
