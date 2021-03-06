package test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {
	@RequestMapping("/person")
	public String person(HttpServletRequest request){
		String personToday="오늘의 인물은 누구?";
		request.setAttribute("personToday", personToday);
		/*
		 * forward 이동해서 응답할 jsp 페이지의 위치를 문자열로 리턴한다.
		 * 
		 * prefix => "/WEB-INF/views/"
		 * suffix => ".jsp"
		 * 
		 * prifix + "fortune" + suffix => "/WEB-INF/views/fortune.jsp"
		 * 
		 */
		return "person";
	}
}
