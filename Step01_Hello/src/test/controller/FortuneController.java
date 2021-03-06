package test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1. Spring Controller 로 만들겠다는 어노테이션
@Controller
public class FortuneController {
	//2. "/fortune.do" 요청을 처리 하겠다는 어노테이션
	@RequestMapping("/fortune")
	public String fortune(HttpServletRequest request){
		String fortuneToday="동쪽으로 가면 귀인을 만나요";
		request.setAttribute("fortuneToday", fortuneToday);
		/*
		 * forward 이동해서 응답할 jsp 페이지의 위치를 문자열로 리턴한다.
		 * 
		 * prefix => "/WEB-INF/views/"
		 * suffix => ".jsp"
		 * 
		 * prifix + "fortune" + suffix => "/WEB-INF/views/fortune.jsp"
		 * 
		 */
		return "fortune";
	}
}
