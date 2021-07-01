package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentId = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 도봉구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentId = 64333;
		studentKim.studentName = "Kim";
		studentKim.address = "서울 마포구";
		
		studentKim.showStudentInfo();
		System.out.println(studentKim);
		System.out.println(studentLee);
	}

}
