package referenceVariable;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);

		Student studentKim = new Student(105, "kim");
		studentKim.setKoreaSubject("국어", 80);
		studentKim.setMathSubject("수학", 99);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}
}
