package ch14_Interface;

public class CalculatorTest {

	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.add(num1, num2));
		
		calc.description();
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr)); //static메서드이기 때문에 인터페이스이름으로 바로 호출해서 사용해도 된다.
		
	
		
	}

}
