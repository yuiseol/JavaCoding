package constructor;

public class Order {
	long receiptNumber;
	int phoneNumber;
	String address;
	int date;
	int clock;
	int price;
	int menuNumber;
	
	public Order(long receiptNumber, int phoneNumber, String address, int date, int clock, int price,
			int menuNumber) {
		super();
		this.receiptNumber = receiptNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.date = date;
		this.clock = clock;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	
	public void OderInfo() {
		System.out.println("주문 접수 번호 : " + receiptNumber + "\n" +
		"주문 핸드폰 번호 : " + phoneNumber + "\n" +
		"주문 집 주소 : " + address + "\n" +
		"주문 날짜 : " + date + "\n" +
		"주문 시간 : " + clock + "\n" +
		"주문 가격 : " + price + "\n" +
		"메뉴 번호 : " + menuNumber);

	}
	
}
