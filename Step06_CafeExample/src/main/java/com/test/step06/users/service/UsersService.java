package com.test.step06.users.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.test.step06.users.dto.UsersDto;

public interface UsersService {
	public void insert(HttpServletRequest request, UsersDto dto);
	public ModelAndView list();
	public void delete(HttpServletRequest request, int num);
	public ModelAndView getData(int num);
}
