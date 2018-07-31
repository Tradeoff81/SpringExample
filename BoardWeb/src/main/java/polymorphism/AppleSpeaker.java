package polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker{
 
	private Speaker speaker;
	
	public AppleSpeaker() {
		// TODO Auto-generated constructor stub
		System.out.println("===> AppleSpeaker 按眉 积己");
	}
	
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("AppleSpeaker---家府 棵赴促.");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("AppleSpeaker---家府 郴赴促.");
	}
	
}
