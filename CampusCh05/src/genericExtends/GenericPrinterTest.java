package genericExtends;

public class GenericPrinterTest {
	
	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
		System.out.println(plasticPrinter);
		
	/*	GenericPrinter powderPrinter2 = new GenericPrinter();
		powderPrinter2.setMaterial(new Powder());
		Powder powder = (Powder)powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		*/
		//GenericPrinter<Water> printer = new GenericPrinter<Water>(); //<T>로 했을 땐 가능했지만 <T extends class>로 했을 땐 불가(Water 클래스에 extend class를 상속받아야한다)
		}
	}

