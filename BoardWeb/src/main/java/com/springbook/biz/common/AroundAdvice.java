package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	
	//������ �޼ҵ忡 �ϳ��� �����̽��� ���� ��/�� ó���� ���� ������ �ϴ� �޼ҵ�
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[Before]: ����Ͻ� �޼ҵ� ���� ���� ó���� ����...");
		
		//proceed()�� �������� ����ڵ�� ��ó��, �ϴ��ڵ�� ��ó���� ����Ѵ�.
		Object returnObj = pjp.proceed();
		
		System.out.println("[After]: ����Ͻ� �޼ҵ� ���� �Ŀ� ó���� ����...");
		
		return returnObj;
	}
}
