package test.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberInsertformController {
	
	@RequestMapping("/member/insertform")
	public String insertform(){
		//회원 추가 폼을 출력해주는 view 페이지로 forward 이동 
		return "member/insertform";
	}
}











