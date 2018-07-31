package polymorphism;

import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("==> SamsungTV(1) 객체 생성");
	}

	public SamsungTV(Speaker speaker) {
		this.speaker = speaker;
		System.out.println("==> SamsungTV(2) 객체 생성");
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("==> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}


	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---전원 켠다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---전원 끈다.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		//System.out.println("SamsungTV---소리 올린다.");
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		//System.out.println("SamsungTV---소리 내린다.");
		speaker.volumeDown();
	}
	
	

}
