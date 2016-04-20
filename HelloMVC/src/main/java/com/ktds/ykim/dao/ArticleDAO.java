package com.ktds.ykim.dao;

import java.util.List;

import com.ktds.ykim.vo.EmployeesVO;

public interface ArticleDAO {

	public String getNowSystemDate();
	public List<EmployeesVO> getAllEmployeeInfo();
}
