package Singleton;

public class Car {
	
	public int CarNum;

	private static int serialNum = 1000;
	
	public Car() {
		serialNum++;
		CarNum = serialNum;
	}
	public int getCarNum() {
		return CarNum;
	}
	
}
