package com.gura.step07;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlayController {
	
	@RequestMapping("/private/play")
	public ModelAndView privatePlay(HttpServletRequest request){
		
		ModelAndView mView=new ModelAndView();
		mView.setViewName("private/play");
		
		return mView; //AOP를 적용하면 전달 전에 가로채서 수정을 할 수 있다
	}
	
}
