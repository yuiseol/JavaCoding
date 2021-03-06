package object_equals;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1;
		
		System.out.println(std1 == std2); //false
		System.out.println(std1.equals(std2)); //true
		System.out.println(std1 = std3); //true
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode()); //두개의 메모리가 다르기 때문에 전혀 다른값, 그렇지만 해시코드를 찍었을 땐 같은 값이 나와야하기때문에 해시코드 오버라이딩 한부분에 학번을 넣음.
		
		System.out.println(System.identityHashCode(std1));//진짜해시코드값을 출력해줌
		System.out.println(System.identityHashCode(std2));

		std1.setStudentName("kim");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent.toString());
	}

}
