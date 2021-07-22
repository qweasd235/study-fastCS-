package ch17;

public class Super extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빠르게 달린다");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump한다");
	}

	@Override
	public void turn() {
		System.out.println("turn 한다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("======= 슈퍼 레벨이다 =======");
	}

	
}
