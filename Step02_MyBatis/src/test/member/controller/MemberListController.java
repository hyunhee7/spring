package test.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import test.member.service.MemberService;

//1. component scan 이 되었을때 스프링 컨테이너에서 관리 되도록 
@Controller
public class MemberListController {
	//3. 의존 객체를 주입 받을수 있도록 (Dependency Injection)
	@Autowired
	private MemberService memberSerivce;
	
	//2. 요청이 맵핑될수 있도록 
	@RequestMapping("/member/list")
	public ModelAndView list(){
		
		//Data 가 담겨진 ModelAndView 객체를 리턴 받고 
		ModelAndView mView=memberSerivce.getList();
		
		//forward 이동할 view 페이지 정보를 넣어주고 
		mView.setViewName("member/list");
		
		/*
		 *  ModelAndView 객체를 리턴해주면 
		 *  객체에 담긴 Data 가 request 에 자동으로 담기고
		 *  view 페이지로 알아서 forward 이동 된다. 
		 */
		return mView;
	}
}










