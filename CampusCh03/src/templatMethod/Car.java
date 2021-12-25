package templatMethod;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}
	
	final public void run() { //시동보다 드라이브가 먼저 될 수 없으니까 재정의를 못하게 final
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
		
	}
}
