package ch14_Interface;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 == 0)
			return ERROR;
		
		return num1/num2;
	}
	
	public void showInfo() {
		
		System.out.println("모두 구현했습니다.");
	}
	

	@Override
	public void description() { //이미 제공하고 있는 default메서드를 재정의할 수 있다.
		System.out.println("completeCalc overriding");
	}
	

}
