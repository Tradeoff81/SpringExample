package com.springbook.biz.common;

public class AfterAdvice {
	
	//try~catch~finally 구문의 finally 블럭 처럼 무조건 실행되는 어드바이스 메소드
	public void finallyLog() {
		System.out.println("[사후 처리] 비즈니스 로직 수행 후 무조건 동작");
	}
}
