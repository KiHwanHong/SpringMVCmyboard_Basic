package gihwan.spring.polymorphism;

public class LgTV implements TV{
	
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
		System.out.println("LgTV ������ �ø���.");
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LgTV ������ ������.");
	}
}
