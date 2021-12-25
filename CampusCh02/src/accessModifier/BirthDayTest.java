package accessModifier;

public class BirthDayTest {

	public static void main(String[] args) {
		
		BirthDay date = new BirthDay();
		date.setYear(2019);
		date.setMonth(13);
		date.setDay(31); //private 인 경우
		
		//public이나 default일 경우 100달이라는건 없지만 넣을 수 있다.
		// 멤버 변수의 오용을 객체가 잘못 사용되는 것을 노출하게 되고 객체의 역할에 대해서 문제가 생길수 있다.
		//그래서 이런경우 private로 막아주고 set()에서 제어해준다. 제어해주면 쓸데없는 데이터 오용을 막을 수 있다.
//		date.month = 100;
		
		date.showDate();
	}

}
