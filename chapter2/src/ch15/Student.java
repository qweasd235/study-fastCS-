package ch15;

public class Student {

	String stuName;
	int money;
	
	public Student(String stuName, int money) {
		this.stuName = stuName;
		this.money = money;
	}
	
	public void takeTexi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(stuName + "���� ���� ���� " + money + "���Դϴ�.");
	}
}
