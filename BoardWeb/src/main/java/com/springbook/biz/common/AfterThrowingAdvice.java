package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterThrowingAdvice {
	
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")	//����Ʈ�� ����
	public void allPointcut(){}
	
	//������ �޼ҵ尡 ���� �� ���ܰ� �߻��� ��� �����ϴ� �޼ҵ�
	//JoinPoint: beforeAdvice ����.
	//exceptObj; ���ε� ����. ��� ���� ��ü�� ���ε� �� �� �ֵ��� Exception������ ����.
	//���ε� ���� ��� �� applicationContext.xml�� 'aop:after-throwing'�±׿� 
	//'throwing="{���ε� ������}"�� �߰� �ؾ��Ѵ�. [������̼� �̻�� ��]
	@AfterThrowing(pointcut="allPointcut()", throwing="exceptObj")	//�����̽� ����
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		
		System.out.println("[���� ó��] " + method + "() �޼ҵ� ���� �� �߻��� ���� �޽��� : "
				+ exceptObj.getMessage());
	}
}
