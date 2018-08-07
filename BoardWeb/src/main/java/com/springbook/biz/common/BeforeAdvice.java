package com.springbook.biz.common;

public class BeforeAdvice {
	
	//설정된 메소드가 실행 전에 동작하는 메소드
	public void beforeLog() {
		System.out.println("[사전 처리] 비즈니스 로직 수행 전 동작");
	}
}
