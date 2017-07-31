package test.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrintLogAspect {
	
	@Around("execution(public void select())")
	public Object printLog(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("비즈니스 로직을 수행하기 직전입니다.");
		Object obj=joinPoint.proceed();
		System.out.println("비즈니스 로직을 수행했습니다.");
		return obj;
	}
}
