interface PhoneInterface{
	final int TIMEOUT = 10000;
	void sendCall(); // �߻�
	void receiveCall(); // �߻�
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class Calc{
	public int calculator(int x, int y) {
		return x + y;
	}
}

class SamsungPhone extends Calc implements PhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("�츮������");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
	
	public void schedule() {
		System.out.println("���� �����մϴ�.");
	}
	
}

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		System.out.println("3�� 5�� ���ϸ� " + phone.calculator(3, 5));
		phone.schedule();
	}

}
