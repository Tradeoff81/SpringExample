package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


@Service
@Aspect		// = Pointcut + Advice
public class LogAdvice {
	
	//포인트컷 선언
	/*
	<aop:config>
		<aop:pointcut id="allPointcut"
					expression="execution(* com.springbook.biz..*Impl.*(..))"/>
					...
	 */
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut(){}
	
	
	//어드바이스 선언(Before)
	@Before("allPointcut()")
	public void printLog(JoinPoint jp) {
		System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
	}
}
