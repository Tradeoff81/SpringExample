package polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker{
 
	private Speaker speaker;
	
	public AppleSpeaker() {
		// TODO Auto-generated constructor stub
		System.out.println("===> AppleSpeaker ��ü ����");
	}
	
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("AppleSpeaker---�Ҹ� �ø���.");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("AppleSpeaker---�Ҹ� ������.");
	}
	
}
