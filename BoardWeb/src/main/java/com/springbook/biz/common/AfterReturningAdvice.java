package com.springbook.biz.common;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.aspectj.lang.JoinPoint;

import com.springbook.biz.user.UserVO;

public class AfterReturningAdvice {
	
	//설정된 메소드가 정상적인 샐행 후 리턴하는 시점에서 동작하는 메소드 (ex. getter 메소드가 실행 후 리턴 할 때)
	//JoinPoint: beforeAdvice 참고.
	//returnObj; 바인드 변수. 리턴 값이 어떤 타입이 될지 모르기 때문에 Object형으로 선언.
	//바인드 변수 사용 시 applicationContext.xml의 'aop:after-returning'태그에 
	//'returning="{바인드 변수명}"을 추가 해야한다.
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		
		if(returnObj instanceof UserVO) {
			UserVO user = (UserVO)returnObj;
			if(user.getRole().equals("Admin")) {
				System.out.println(user.getName() + " 로그인(Admin)");
			}
		}
		
		System.out.println("[사후 처리] " + method + "() 메소드 리턴값 : "
				+ returnObj.toString());
	}
}
