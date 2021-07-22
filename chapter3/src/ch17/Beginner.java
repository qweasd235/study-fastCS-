package ch17;

public class Beginner extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달린다");
	}

	@Override
	public void jump() {
		System.out.println("jump 못한다");
	}

	@Override
	public void turn() {
		System.out.println("turn 못한다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("======== 초급 레벨이다 =======");
	}

	
}
