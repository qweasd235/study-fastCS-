package ch10;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���� ���� �Ѵ�");
		System.out.println("�ڵ����� ������ ���� ��ȯ�Ѵ�.");
	}

	@Override
	public void stop() {
		System.out.println("��ֹ� �տ��� ������ ����");
	}

	@Override
	public void wiper() {
		System.out.println("�ڵ� ������");
	}

	@Override
	public void washCar() {
		System.out.println("�ڵ� ������ �Ѵ�.");
	}

}
