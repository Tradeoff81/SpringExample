package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class BeforeAdvice {
	
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")	//포인트컷 선언
	public void allPointcut(){}
	
	//설정된 메소드가 실행 전에 동작하는 메소드
	//JoinPoint; 클라이언트가 호출한 비지니스 메소드의 정보가 들어있는 클래스
	@Before("allPointcut()")		//어드바이스 선언
	public void beforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		//클라이언트가 호출한 메소드의  시그니처 정보에서 메소드 이름 반환
		Object[] args = jp.getArgs();
		//메소드가 호출될 때 넘겨준 인자들의 배열
		
		System.out.println("[사전 처리] " + method + "() 메소드 ARGS 정보 : "
				+ (args.length==0?"-":args[0].toString()));
	}
}
