package ch10;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("����� ������");
		System.out.println("����� �ڵ� ������");
	}

	@Override
	public void stop() {
		System.out.println("��ֹ� �տ��� �극��ũ ��� ������");
	}

	@Override
	public void wiper() {
		System.out.println("����� �������� ������ ��");
		
	}

}
