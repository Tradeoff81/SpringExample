package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{

	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		// TODO Auto-generated constructor stub
		System.out.println("==> LgTV(1) ��ü ����");
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV---���� �Ҵ�.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV---���� ����.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		//System.out.println("LgTV---�Ҹ� �ø���.");
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		//System.out.println("LgTV---�Ҹ� ������.");
		speaker.volumeDown();
	}
	
}
