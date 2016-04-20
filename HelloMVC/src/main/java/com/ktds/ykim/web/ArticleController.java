package com.ktds.ykim.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ktds.ykim.biz.ArticleBiz;
import com.ktds.ykim.vo.EmployeesVO;

@Controller
public class ArticleController {

	private Logger logger = LoggerFactory.getLogger(ArticleController.class);
	
	private ArticleBiz articleBiz;
	
	
	public void setArticleBiz(ArticleBiz articleBiz) {
		this.articleBiz = articleBiz;
	}

	@RequestMapping("/list")
	public ModelAndView articleList (HttpSession session) {
		
		String nowDate = articleBiz.insertNewArticle();
		
		logger.trace("안녕하세요. 트레이스 입니다.");
		logger.debug("안녕하세요. 디버그 입니다.");
		logger.info("안녕하세요. 인포 입니다.");
		logger.warn("안녕하세요. 워닝 입니다.");
		logger.error("안녕하세요. 에러 입니다.");
		
		
		ModelAndView view = new ModelAndView();
		view.setViewName("article/list");
		
		List<EmployeesVO> allEmployees = articleBiz.getAllEmployeeInfo();
		view.addObject("allEmployees", allEmployees);
		
		//request.setAttribute("Key", value);
		view.addObject("title", "제목");
		view.addObject("number", "번호");
		view.addObject("author", "홍길동");
		view.addObject("date", nowDate);
		
		return view;
	}
	
	@RequestMapping("/detail/{articleNumber}")
	public ModelAndView detail(@PathVariable int articleNumber) {
		ModelAndView view = new ModelAndView();
		view.setViewName("article/detail");
		view.addObject("articleNumber", articleNumber);
		
		return view;
	}
	
}




















