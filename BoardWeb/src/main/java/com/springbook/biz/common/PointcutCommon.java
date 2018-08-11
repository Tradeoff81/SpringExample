package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {
	//����Ʈ�� �ߺ� ������ �����ϱ� ���� ����Ʈ�Ƹ� ������ Ŭ����.
	//Ŭ������ '@Service' ������̼��� �������� ����.
	
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")	//����Ʈ�� ����
	public void allPointcut(){}
	
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")	//����Ʈ�� ����
	public void getPointcut(){}
	
}
