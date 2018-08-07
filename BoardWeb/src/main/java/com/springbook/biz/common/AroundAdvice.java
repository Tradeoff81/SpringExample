package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	
	//설정된 메소드에 하나의 어드바이스로 실행 전/후 처리에 대한 동작을 하는 메소드
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[Before]: 비즈니스 메소드 수행 전에 처리할 내용...");
		
		//proceed()를 기준으로 상단코드는 전처리, 하단코드는 후처리를 담당한다.
		Object returnObj = pjp.proceed();
		
		System.out.println("[After]: 비즈니스 메소드 수행 후에 처리할 내용...");
		
		return returnObj;
	}
}
