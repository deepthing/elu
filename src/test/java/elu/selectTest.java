package elu;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liang.deng.dao.EluRouteDetailMapper;
import com.liang.deng.service.CalRoute.FuzzySyntheticEvaluation;

public class selectTest {
	@Resource
	EluRouteDetailMapper routeDeatilMapper;
	public static void main(String args[]){
		 ApplicationContext context = new ClassPathXmlApplicationContext("/conf/spring-mybatis.xml");
		 FuzzySyntheticEvaluation fuzzy =  context.getBean(FuzzySyntheticEvaluation.class);
		 System.out.println(fuzzy.getResoure(3).getRouteName());
	}
}
