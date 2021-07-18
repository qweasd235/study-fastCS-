package ch10;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전함");
		System.out.println("사람이 핸들 조작함");
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞에서 브레이크 밟아 정차함");
	}

	@Override
	public void wiper() {
		System.out.println("사람이 수동으로 와이퍼 켬");
		
	}

}
