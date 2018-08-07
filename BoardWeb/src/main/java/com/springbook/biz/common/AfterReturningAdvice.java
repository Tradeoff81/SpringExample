package com.springbook.biz.common;

public class AfterReturningAdvice {
	
	//설정된 메소드가 정상적인 샐행 후 리턴하는 시점에서 동작하는 메소드 (ex. getter 메소드가 실행 후 리턴 할 때)
	public void afterLog() {
		System.out.println("[사후 처리] 비즈니스 로직 수행 후 동작");
	}
}
