package com.springbook.biz.common;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserVO;

@Service
@Aspect
public class AfterReturningAdvice {

	//������ �޼ҵ尡 �������� ���� �� �����ϴ� �������� �����ϴ� �޼ҵ� (ex. getter �޼ҵ尡 ���� �� ���� �� ��)
	//JoinPoint: beforeAdvice ����.
	//returnObj; ���ε� ����. ���� ���� � Ÿ���� ���� �𸣱� ������ Object������ ����.
	//���ε� ���� ��� �� applicationContext.xml�� 'aop:after-returning'�±׿� 
	//'returning="{���ε� ������}"�� �߰� �ؾ��Ѵ�. [������̼� �̻�� ��]
	@AfterReturning(pointcut="PointcutCommon.getPointcut()", returning="returnObj")	//�����̽� ����
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		
		if(returnObj instanceof UserVO) {
			UserVO user = (UserVO)returnObj;
			if(user.getRole().equals("Admin")) {
				System.out.println(user.getName() + " �α���(Admin)");
			}
		}
		
		System.out.println("[���� ó��] " + method + "() �޼ҵ� ���ϰ� : "
				+ returnObj.toString());
	}
}