package templatMethod;

public class CarTest {

	public static void main(String[] args) {
		
		Car aiCar = new AiCar();
		aiCar.run();
		
		System.out.println("==============================");
		
		Car mCar = new ManualCar();
		mCar.run();
	}

}
