package ch17;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("���� �޸���.");
	}

	@Override
	public void jump() {
		System.out.println("���� jump�Ѵ�.");
	}

	@Override
	public void turn() {
		System.out.println("turn ���Ѵ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("======== �߱� �����̴� ========");
	}

	
}
