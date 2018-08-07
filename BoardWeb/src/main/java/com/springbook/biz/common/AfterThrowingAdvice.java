package com.springbook.biz.common;

public class AfterThrowingAdvice {
	
	//설정된 메소드가 실행 중 예외가 발생할 경우 동작하는 메소드
	public void exceptionLog() {
		System.out.println("[예외 처리] 비즈니스 로직 수행 중 예외 발생");
	}
}
