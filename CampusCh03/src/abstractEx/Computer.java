package abstractEx;

public abstract class Computer {
	
	public abstract void display();
	public abstract void typing(); //자기가 구현하지 못 할 메서드는 추상메서드로 두고 하위클래스에게 그 책임을 위임한다.
	
	void turnOn() {
		System.out.println("전원을 켭니다"); //공통으로 쓸 메서드는 구현
	}
	
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
