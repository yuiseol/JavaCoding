package ch15_interface;

public interface Buy {

	void buy();
	
	default void order() {
		System.out.println("buy order");
	}
}
