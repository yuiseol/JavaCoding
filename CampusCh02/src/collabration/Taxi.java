package collabration;

public class Taxi {
	String taxiCompanyName;
	int money;
	
	public Taxi(String taxiCompanyName) {
		this.taxiCompanyName = taxiCompanyName;
	}
	
	public void take(int money) {
		this.money += 10000;
	}
	public void showTaxiInfo() {
		System.out.println(taxiCompanyName + " 수입은 " + money + "원 입니다.");
	}
	
}
