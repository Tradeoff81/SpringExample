package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	
	//������ �޼ҵ尡 ���� ���� �����ϴ� �޼ҵ�
	//JoinPoint; Ŭ���̾�Ʈ�� ȣ���� �����Ͻ� �޼ҵ��� ������ ����ִ� Ŭ����
	public void beforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		//Ŭ���̾�Ʈ�� ȣ���� �޼ҵ���  �ñ״�ó �������� �޼ҵ� �̸� ��ȯ
		Object[] args = jp.getArgs();
		//�޼ҵ尡 ȣ��� �� �Ѱ��� ���ڵ��� �迭
		
		System.out.println("[���� ó��] " + method + "() �޼ҵ� ARGS ���� : "
				+ (args.length==0?"-":args[0].toString()));
	}
}
