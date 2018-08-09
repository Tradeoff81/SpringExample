package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AroundAdvice {
	
	//������ �޼ҵ忡 �ϳ��� �����̽��� ���� ��/�� ó���� ���� ������ �ϴ� �޼ҵ�
	//ProceedingJoinPoint: JoinPoint�� ����� Ŭ����. proceed()�� ����ϱ� ���� ����.
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[Before]: ����Ͻ� �޼ҵ� ���� ���� ó���� ����...");
		
		String method = pjp.getSignature().getName();
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		//proceed()�� �������� ����ڵ�� ��ó��, �ϴ��ڵ�� ��ó���� ����Ѵ�.
		Object returnObj = pjp.proceed();
		
		System.out.println("[After]: ����Ͻ� �޼ҵ� ���� �Ŀ� ó���� ����...");
		
		stopWatch.stop();
		System.out.println(method + "() �޼ҵ� ���࿡ �ɸ� �ð� : " 
				+ stopWatch.getTotalTimeMillis() + "(ms)��");
		
		return returnObj;
	}
}
