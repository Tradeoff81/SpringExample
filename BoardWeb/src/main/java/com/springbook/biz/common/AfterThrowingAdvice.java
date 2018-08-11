package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterThrowingAdvice {
	
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")	//포인트컷 선언
	public void allPointcut(){}
	
	//설정된 메소드가 실행 중 예외가 발생할 경우 동작하는 메소드
	//JoinPoint: beforeAdvice 참고.
	//exceptObj; 바인드 변수. 모든 예외 객체를 바인드 할 수 있도록 Exception형으로 선언.
	//바인드 변수 사용 시 applicationContext.xml의 'aop:after-throwing'태그에 
	//'throwing="{바인드 변수명}"을 추가 해야한다. [어노테이션 미사용 시]
	@AfterThrowing(pointcut="allPointcut()", throwing="exceptObj")	//어드바이스 선언
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		
		System.out.println("[예외 처리] " + method + "() 메소드 수행 중 발생한 예외 메시지 : "
				+ exceptObj.getMessage());
	}
}
