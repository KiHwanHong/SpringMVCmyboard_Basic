package gihwan.spring.polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LG TV ��ü�� �����Ѵ�.");
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV ������ �Ҵ�.");
	}
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
		System.out.println("LgTV ������ ����.");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		speaker.volumeDown();
	}
}
