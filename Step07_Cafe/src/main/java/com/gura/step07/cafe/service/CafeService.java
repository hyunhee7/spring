package com.gura.step07.cafe.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.gura.step07.cafe.dto.CafeCommentDto;
import com.gura.step07.cafe.dto.CafeDto;

public interface CafeService {
	public void insert(CafeDto dto);
	public void update(CafeDto dto);
	public void delete(int num);
	public ModelAndView list(HttpServletRequest request);
	public ModelAndView detail(int num);
	public void commentInsert(CafeCommentDto dto);
	public void increateViewCount(int num);
}	
