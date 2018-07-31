package polymorphism;

import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("==> SamsungTV(1) ��ü ����");
	}

	public SamsungTV(Speaker speaker) {
		this.speaker = speaker;
		System.out.println("==> SamsungTV(2) ��ü ����");
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("==> SamsungTV(3) ��ü ����");
		this.speaker = speaker;
		this.price = price;
	}


	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() ȣ��");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() ȣ��");
		this.price = price;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---���� ����.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		//System.out.println("SamsungTV---�Ҹ� �ø���.");
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		//System.out.println("SamsungTV---�Ҹ� ������.");
		speaker.volumeDown();
	}
	
	

}
