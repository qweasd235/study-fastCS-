package ch08;

public class Person {

		public int height;
		public int weight;
		public String name;
		public int age;
		
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public void showPersonInfo() {
			System.out.println("Ű�� " + height + "�̰� �����԰� " + weight + "ų���� ������ �ֽ��ϴ�. �̸��� " + name + "�̰� ���̴� " + age + "���Դϴ�.");
		}
		
	}
	

