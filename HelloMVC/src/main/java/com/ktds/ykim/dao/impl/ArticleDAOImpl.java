package com.ktds.ykim.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ktds.ykim.dao.ArticleDAO;
import com.ktds.ykim.vo.EmployeesVO;

public class ArticleDAOImpl extends SqlSessionDaoSupport implements ArticleDAO {

	@Override
	public String getNowSystemDate() {
		return getSqlSession().selectOne("ArticleDAO.getNowSystemDate");
	}

	@Override
	public List<EmployeesVO> getAllEmployeeInfo() {
		
		String lastName= "King";
		
		Map<String, Object> parameters = new HashMap<String, Object>();
//		parameters.put("firstName", "Steven");
//		parameters.put("lastName", "King");
		
		EmployeesVO employee = new EmployeesVO();
//		employee.setFirstName("Steven");
//		employee.setLastName("King");
		
		List<Integer> managerId = new ArrayList<Integer>();
		managerId.add(100);
		managerId.add(101);
		managerId.add(102);
		managerId.add(103);
		
		parameters.put("employee", employee);
		parameters.put("managerIds", managerId);
		
		
		return getSqlSession().selectList("ArticleDAO.getAllEmployeeInfo", parameters);
	}
	
	
	
}
