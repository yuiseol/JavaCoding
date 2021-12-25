package Singleton;

import java.util.Calendar;

public class CompanyTest {
	public static void main(String[] args) {
	
	Company company1 = Company.getInstance(); //인스턴스를 만들지 않고 바로 가져다 쓰기 위해서 getInstance()는 static메서드로 제공되어야한다.
	Company company2 = Company.getInstance();
	
	System.out.println(company1);
	System.out.println(company2);
	
//	Calendar calendar = Calendar.getInstance();
//	System.out.println(calendar);
	}
}