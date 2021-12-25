package abstractEx;

public class DeskTop extends Computer{ //추상클래스가 되거나 Computer의 추상메서드를 구현하던가

	@Override
	public void display() {
		System.out.println("DeskTop display");
		
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
		
	}

	@Override
	void turnOff() {
		System.out.println("Desktop turnOff");
	} 
	
	
}
