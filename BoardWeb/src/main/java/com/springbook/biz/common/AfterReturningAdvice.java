package com.springbook.biz.common;

public class AfterReturningAdvice {
	
	//������ �޼ҵ尡 �������� ���� �� �����ϴ� �������� �����ϴ� �޼ҵ� (ex. getter �޼ҵ尡 ���� �� ���� �� ��)
	public void afterLog() {
		System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ����");
	}
}
