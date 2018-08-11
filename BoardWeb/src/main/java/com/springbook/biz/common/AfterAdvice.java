package com.springbook.biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterAdvice {
	
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")	//포인트컷 선언
	public void allPointcut(){}
	
	//try~catch~finally 구문의 finally 블럭 처럼 무조건 실행되는 어드바이스 메소드
	@After("allPointcut()")		//어드바이스 선언
	public void finallyLog() {
		System.out.println("[사후 처리] 비즈니스 로직 수행 후 무조건 동작");
	}
}
