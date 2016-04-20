package com.ktds.ykim.biz.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ktds.ykim.biz.ArticleBiz;
import com.ktds.ykim.dao.ArticleDAO;
import com.ktds.ykim.vo.EmployeesVO;

public class ArticleBizImpl implements ArticleBiz {
	
	private Logger logger = LoggerFactory.getLogger(ArticleBizImpl.class);
	
	private ArticleDAO articleDAO;
	
	public void setArticleDAO(ArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}

	@Override
	public String insertNewArticle() {
		logger.debug("insertNewArticle을 호출했습니다~");
		String nowDate = articleDAO.getNowSystemDate();
		logger.info("현재시간은 {} 입니다." , nowDate);
		
		return nowDate;
	}

	@Override
	public List<EmployeesVO> getAllEmployeeInfo() {
		return articleDAO.getAllEmployeeInfo();
	}
	
	
	

}	
