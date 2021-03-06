package ch14_Interface;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = 999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() { //인스턴스 생성 후에 쓰인다.
		System.out.println("정수의 사칙연산을 제공합니다.");
		myMethod();
	}
	
	static int total(int[] arr) { //정적메서드는 인스턴스생성과 상관없이 쓰인다.
		
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("myMethod");
	}
	private static void myStaticMethod() {
		System.out.println("MyStaticMethod");
	}
}

