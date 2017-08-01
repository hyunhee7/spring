package com.gura.step07.aspect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Aspect
@Component
public class LoginAspect {
	
	@Around("execution(* private*(..))")
	public Object loginCheck(ProceedingJoinPoint joinPoint) throws Throwable{
		//Aop가 적용된 메소드에 전달된 인자를 Object[]에 담아온다.
		Object[] args=joinPoint.getArgs();
		//로그인 여부
		boolean isLogin=false;
		HttpServletRequest request=null;
		for(Object tmp:args){
			if(tmp instanceof HttpServletRequest){
				request=(HttpServletRequest)tmp;
				HttpSession session=request.getSession();
				//만일 로그인 정보가 존재 한다면
				if(session.getAttribute("id")!=null){
					//로그인 했다는 의미에서 변수에 true를 넣어둔다.
					isLogin=true;
				}
			}
		}
		//Aop가 적용된 메소드가 리턴해주는 객체를 Object type으로 받는다.
		Object obj=joinPoint.proceed();
		if(obj instanceof ModelAndView){
			//원래 type으로 casting 해서
			ModelAndView mView=(ModelAndView)obj;
			//조건부로 원하는 작업을 한다.
			if(!isLogin){//로그인을 하지 않았으면
				//view 페이지 정보를 수정한다
				mView.setViewName("alert");
				mView.addObject("msg","로그인이 필요합니다");
				//원래 가야할 목적지를 얻어내서
				String url=request.getRequestURI();
				String cPath=request.getContextPath();
				//확인을 눌렀을 때 리다일렉트 이동할 url 주소를 구성한다.
				String redirectUrl=cPath+"/users/signin_form.do?url="+url;
				
				mView.addObject("redirectUrl",redirectUrl);
				
			}
		}
		return obj;
	}
}
