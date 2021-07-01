package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentChoi = new Student(100, "Choi");
		studentChoi.setKoreaSubject("국어", 100);
		studentChoi.setMathSubject("수학", 80);
		
		Student studentKim = new Student(100, "kim");
		studentKim.setKoreaSubject("국어", 90);
		studentKim.setMathSubject("수학", 50);
		
		studentChoi.showScoreInfo();
		studentKim.showScoreInfo();
	}

}
