package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	
	//������ �޼ҵ尡 ���� �� ���ܰ� �߻��� ��� �����ϴ� �޼ҵ�
	//JoinPoint: beforeAdvice ����.
	//exceptObj; ���ε� ����. ��� ���� ��ü�� ���ε� �� �� �ֵ��� Exception������ ����.
	//���ε� ���� ��� �� applicationContext.xml�� 'aop:after-throwing'�±׿� 
	//'throwing="{���ε� ������}"�� �߰� �ؾ��Ѵ�.
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		
		System.out.println("[���� ó��] " + method + "() �޼ҵ� ���� �� �߻��� ���� �޽��� : "
				+ exceptObj.getMessage());
	}
}
