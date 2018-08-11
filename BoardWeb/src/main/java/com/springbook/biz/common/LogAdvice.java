package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


@Service
@Aspect		// = Pointcut + Advice
public class LogAdvice {
	
	//����Ʈ�� ����
	/*
	<aop:config>
		<aop:pointcut id="allPointcut"
					expression="execution(* com.springbook.biz..*Impl.*(..))"/>
					...
	 */
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut(){}
	
	
	//�����̽� ����(Before)
	@Before("allPointcut()")
	public void printLog(JoinPoint jp) {
		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����");
	}
}
