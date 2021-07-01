package ch24;

public class StudentTest {

	public static void main(String[] args) {

		Student studentChoi = new Student(1001, "Choi");
		
		studentChoi.addSubject("국어", 100);
		studentChoi.addSubject("영어", 88);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("국어", 89);
		studentKim.addSubject("영어", 79);
		studentKim.addSubject("수학", 80);
		
		studentChoi.showStudentInfo();
		System.out.println("=====================================");
		studentKim.showStudentInfo();
	}

}
