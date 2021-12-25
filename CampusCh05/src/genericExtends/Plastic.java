package genericExtends;

public class Plastic extends Material{
	
	@Override
	public void doPrinting() {
		System.out.println("재료는 Plastic 입니다");
	}
	
	public String toString() {
		return "재료는 Plastic 입니다";
	}
		

}
