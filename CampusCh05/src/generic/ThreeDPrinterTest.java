package generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		ThreeDPrinterThree printer = new ThreeDPrinterThree();

		printer.setMaterial(powder);
		
		Powder p = (Powder)printer.getMaterial();
	}

}
