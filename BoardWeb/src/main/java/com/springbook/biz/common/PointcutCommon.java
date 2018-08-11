package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {
	//포인트컷 중복 선언을 방지하기 위해 포인트컷만 정의한 클래스.
	//클래스에 '@Service' 어노테이션은 선언하지 않음.
	
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")	//포인트컷 선언
	public void allPointcut(){}
	
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")	//포인트컷 선언
	public void getPointcut(){}
	
}
