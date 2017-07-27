package test.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import test.member.service.MemberService;

@Controller
public class MemberUpdateformController {
	
	//필요한 서비스객체를 담을 맴버필드를 선언
	@Autowired
	private MemberService memberService;
	
	//요청 맵핑
	@RequestMapping("/member/updateform")
	public ModelAndView updateform(@RequestParam int num){
		//회원 정보를 담고 있는 ModelAndView 객체를 리턴 받는다.
		ModelAndView mView=memberService.getData(num);
		//view 페이지의 정보를 넣어주고 
		mView.setViewName("member/updateform");
		//리턴하기
		return mView;
	}
}

















