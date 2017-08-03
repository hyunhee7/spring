package com.gura.step08;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	@RequestMapping("/home.do")
	public ModelAndView home(){
		List<String> list=new ArrayList<String>();
		list.add("공지 사항입니다..");
		list.add("어쩌구...");
		list.add("저쩌구...");
		ModelAndView mView=new ModelAndView();
		mView.addObject("list", list);
		mView.setViewName("home");
		return mView;
	}
}















