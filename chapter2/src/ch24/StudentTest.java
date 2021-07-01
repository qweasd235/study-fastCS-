package ch24;

public class StudentTest {

	public static void main(String[] args) {

		Student studentChoi = new Student(1001, "Choi");
		
		studentChoi.addSubject("����", 100);
		studentChoi.addSubject("����", 88);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("����", 89);
		studentKim.addSubject("����", 79);
		studentKim.addSubject("����", 80);
		
		studentChoi.showStudentInfo();
		System.out.println("=====================================");
		studentKim.showStudentInfo();
	}

}
