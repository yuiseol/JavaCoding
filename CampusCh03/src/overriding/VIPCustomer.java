package overriding;

public class VIPCustomer extends Customer {

	private String agentId;
	double salesRatio;
	/*
	public VIPCustomer() {
		//super(); //상위클래스의 constructor를 호출해야되는데 없으면 컴파일러가 자동으로 super(); 넣어준다. //하위클래스가 상위클래스의 인스턴스 참조값을 가지게된다.
		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}
	*/
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;

	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

}
